
/**
 * ServiceProductNullFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.nullfields;
            

            /**
            *  ServiceProductNullFields bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ServiceProductNullFields
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ServiceProductNullFields
                Namespace URI = urn:nullfields.ws.rightnow.com/v1_3
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for AdminVisibleInterfaces
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdminVisibleInterfaces =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdminVisibleInterfaces(){
                               return localAdminVisibleInterfaces;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdminVisibleInterfaces
                               */
                               public void setAdminVisibleInterfaces(boolean param){
                            
                                            this.localAdminVisibleInterfaces=param;
                                    

                               }
                            

                        /**
                        * field for CategoryLinks
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCategoryLinks =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCategoryLinks(){
                               return localCategoryLinks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CategoryLinks
                               */
                               public void setCategoryLinks(boolean param){
                            
                                            this.localCategoryLinks=param;
                                    

                               }
                            

                        /**
                        * field for Descriptions
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDescriptions =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDescriptions(){
                               return localDescriptions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Descriptions
                               */
                               public void setDescriptions(boolean param){
                            
                                            this.localDescriptions=param;
                                    

                               }
                            

                        /**
                        * field for DispositionLinks
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDispositionLinks =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDispositionLinks(){
                               return localDispositionLinks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DispositionLinks
                               */
                               public void setDispositionLinks(boolean param){
                            
                                            this.localDispositionLinks=param;
                                    

                               }
                            

                        /**
                        * field for EndUserVisibleInterfaces
                        * This was an Attribute!
                        */

                        
                                    protected boolean localEndUserVisibleInterfaces =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEndUserVisibleInterfaces(){
                               return localEndUserVisibleInterfaces;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndUserVisibleInterfaces
                               */
                               public void setEndUserVisibleInterfaces(boolean param){
                            
                                            this.localEndUserVisibleInterfaces=param;
                                    

                               }
                            

                        /**
                        * field for Parent
                        * This was an Attribute!
                        */

                        
                                    protected boolean localParent =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getParent(){
                               return localParent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Parent
                               */
                               public void setParent(boolean param){
                            
                                            this.localParent=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:nullfields.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ServiceProductNullFields",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ServiceProductNullFields",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AdminVisibleInterfaces",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminVisibleInterfaces), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "CategoryLinks",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCategoryLinks), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Descriptions",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescriptions), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DispositionLinks",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDispositionLinks), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "EndUserVisibleInterfaces",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndUserVisibleInterfaces), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Parent",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParent), xmlWriter);

                                            
                                      }
                                    
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:nullfields.ws.rightnow.com/v1_3")){
                return "ns3";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            attribList.add(
                            new javax.xml.namespace.QName("","AdminVisibleInterfaces"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminVisibleInterfaces));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","CategoryLinks"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCategoryLinks));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Descriptions"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescriptions));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DispositionLinks"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDispositionLinks));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","EndUserVisibleInterfaces"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndUserVisibleInterfaces));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Parent"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParent));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ServiceProductNullFields parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ServiceProductNullFields object =
                new ServiceProductNullFields();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ServiceProductNullFields".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ServiceProductNullFields)com.rightnow.ws.objects.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "AdminVisibleInterfaces"
                    java.lang.String tempAttribAdminVisibleInterfaces =
                        
                                reader.getAttributeValue(null,"AdminVisibleInterfaces");
                            
                   if (tempAttribAdminVisibleInterfaces!=null){
                         java.lang.String content = tempAttribAdminVisibleInterfaces;
                        
                                                 object.setAdminVisibleInterfaces(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdminVisibleInterfaces));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AdminVisibleInterfaces");
                    
                    // handle attribute "CategoryLinks"
                    java.lang.String tempAttribCategoryLinks =
                        
                                reader.getAttributeValue(null,"CategoryLinks");
                            
                   if (tempAttribCategoryLinks!=null){
                         java.lang.String content = tempAttribCategoryLinks;
                        
                                                 object.setCategoryLinks(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCategoryLinks));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CategoryLinks");
                    
                    // handle attribute "Descriptions"
                    java.lang.String tempAttribDescriptions =
                        
                                reader.getAttributeValue(null,"Descriptions");
                            
                   if (tempAttribDescriptions!=null){
                         java.lang.String content = tempAttribDescriptions;
                        
                                                 object.setDescriptions(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDescriptions));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Descriptions");
                    
                    // handle attribute "DispositionLinks"
                    java.lang.String tempAttribDispositionLinks =
                        
                                reader.getAttributeValue(null,"DispositionLinks");
                            
                   if (tempAttribDispositionLinks!=null){
                         java.lang.String content = tempAttribDispositionLinks;
                        
                                                 object.setDispositionLinks(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDispositionLinks));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DispositionLinks");
                    
                    // handle attribute "EndUserVisibleInterfaces"
                    java.lang.String tempAttribEndUserVisibleInterfaces =
                        
                                reader.getAttributeValue(null,"EndUserVisibleInterfaces");
                            
                   if (tempAttribEndUserVisibleInterfaces!=null){
                         java.lang.String content = tempAttribEndUserVisibleInterfaces;
                        
                                                 object.setEndUserVisibleInterfaces(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribEndUserVisibleInterfaces));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("EndUserVisibleInterfaces");
                    
                    // handle attribute "Parent"
                    java.lang.String tempAttribParent =
                        
                                reader.getAttributeValue(null,"Parent");
                            
                   if (tempAttribParent!=null){
                         java.lang.String content = tempAttribParent;
                        
                                                 object.setParent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribParent));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Parent");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    