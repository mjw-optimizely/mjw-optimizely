﻿using System.AddIn;
using System.Windows.Forms;
using RightNow.AddIns.AddInViews;
using System.ServiceModel;
using System;
using System.ServiceModel.Channels;
using Account_CF.CWSS;

namespace Account_CF
{
    internal class WebService
    {
        private static RightNowSyncPortClient _client;

        /// <summary>
        /// 
        /// </summary>
        public WebService()
        {
            _client = null;
        }

        /// <summary>
        /// Inits the SOAP client
        /// </summary>
        /// <param name="globalContext"></param>
        public static RightNowSyncPortClient GetClient(IGlobalContext globalContext)
        {
            if (_client == null)
            {
                try
                {
                    EndpointAddress endPointAddr = new EndpointAddress(globalContext.InterfaceURL + "../services/soap?wsdl");
                        // globalContext.GetInterfaceServiceUrl(ConnectServiceType.Soap));
                    
                    Console.WriteLine("Endpoint address: " + endPointAddr.Uri);
                    BasicHttpBinding binding = new BasicHttpBinding(BasicHttpSecurityMode.TransportWithMessageCredential);
                    binding.Security.Message.ClientCredentialType = BasicHttpMessageCredentialType.UserName;
                    binding.ReceiveTimeout = new TimeSpan(0, 10, 0);
                    binding.MaxReceivedMessageSize = 1048576; //1MB
                    binding.SendTimeout = new TimeSpan(0, 10, 0);                   

                    _client = new RightNowSyncPortClient(binding, endPointAddr);

                    BindingElementCollection elements = _client.Endpoint.Binding.CreateBindingElements();
                    elements.Find<SecurityBindingElement>().IncludeTimestamp = false;

                    _client.Endpoint.Binding = new CustomBinding(elements);                    
                    // globalContext.PrepareConnectSession(_client.ChannelFactory);
                    _client.ClientCredentials.UserName.UserName = globalContext.Login;
                    // _client.ClientCredentials.UserName.Password = "BD6DN5bFJsgH";                    

                    //headerInfo = new ClientInfoHeader();
                    //headerInfo.AppID = "Bing Maps Addin";
                }
                catch (Exception ex)
                {
                    throw ex;
                }
            }

            return _client;
        }
    }

    [AddIn("EventConsoleOpen AddIn", Version = "1.0.0.0")]
    public class EventConsoleOpen : IEventConsoleOpen
    {

        #region IAddInBase Members

        /// <summary>
        /// Method which is invoked from the Add-In framework and is used to programmatically control whether to load the Add-In.
        /// </summary>
        /// <param name="GlobalContext">The Global Context for the Add-In framework.</param>
        /// <returns>If true the Add-In to be loaded, if false the Add-In will not be loaded.</returns>
        public bool Initialize(IGlobalContext GlobalContext)
        {
            RightNowSyncPortClient client = null;

            try
            {
                client = WebService.GetClient(GlobalContext);
            }
            catch (Exception e)
            {
                MessageBox.Show("Exception getting client: " + e.Message);
                client = null;
                return false;
            }

            Account account = new Account();
            ID acctID = new ID();
            acctID.id = 1;
            acctID.idSpecified = true;
            account.ID = acctID;

            //Clear out the custom field by setting it to null.
            //This sample assumes a custom field named con_text with data type of string.
            GenericField customField = new GenericField();
            customField.name = "c$fakesessionid";
            customField.dataType = DataTypeEnum.STRING;
            customField.dataTypeSpecified = true;
            customField.DataValue = createStringDataValue("zqC9m3yC4rE9");

            GenericField[] customFieldArray = new GenericField[] { customField };
            account.CustomFields = customFieldArray;

            ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
            clientInfoHeader.AppID = "Set Custom Field Value";            

            RNObject[] accountObjects = new RNObject[] { account };
            UpdateProcessingOptions updateProcessingOptions = new UpdateProcessingOptions();

            try
            {
                client.Update(clientInfoHeader, accountObjects, updateProcessingOptions);
            }
            catch (Exception e)
            {
                MessageBox.Show("Exception sending update: " + e.Message);
                return false;
            }

            return true;
        }

        private DataValue createStringDataValue(String val)
        {
            DataValue dv = new DataValue();
            dv.Items = new Object[] { val };
            dv.ItemsElementName = new ItemsChoiceType[] { ItemsChoiceType.StringValue };
            return dv;
        }

        #endregion
    }
    
    [AddIn("EventConsoleClose AddIn", Version = "1.0.0.0")]
    public class EventConsoleClose : IEventConsoleClose
    {

        #region IEventConsoleClose Members

        /// <summary>
        /// Method which is invoked when the "Console Close" event occurs.
        /// </summary>
        /// <param name="Reason">The reason for the console close.</param>
        public void Notify(CloseReason Reason)
        {
        }

        #endregion

        #region IAddInBase Members

        /// <summary>
        /// Method which is invoked from the Add-In framework and is used to programmatically control whether to load the Add-In.
        /// </summary>
        /// <param name="GlobalContext">The Global Context for the Add-In framework.</param>
        /// <returns>If true the Add-In to be loaded, if false the Add-In will not be loaded.</returns>
        public bool Initialize(IGlobalContext GlobalContext)
        {
            return true;
        }

        #endregion
    }
}
