<?
// Flower box is mandatory, contents are significant. See
// http://rnt-community.hivelive.com/posts/0babd4b21b.
// * Objects can be a comma-separated list of multiple objects. Custom objects
//   should be listed as e.g. "CO\Store"
// * Likewise, actions can be a comma-separated list of multiple actions.
// * Version refers to the CCOM version in play, not the SPM version.
/*
 * CPMObjectEventHandler: refno_splitter
 * Package: RN
 * Objects: Incident
 * Actions: Create
 * Version: 1.2
 */

// Useful resources are available at https://stbeehive.oracle.com/teamcollab/wiki/RNow+Service:UE+Managed+Framework+-+External+Events+and+Custom+Processes+%28SPM-CPM%29
// If you add comments before the leading "<?" it will cause problems when 
// running the test harness. This probably should get written up in QA.

// Note this is the CPM/SPM version. *sigh*
use \RightNow\CPM\v1 as RNCPM;

// This is the implementation of the Object Event Handler. It must be a class,
// that implements RightNow\CPM\v1\ObjectEventHandler.
//
// Required function signature:
//   public static function apply ($run_mode, $action, $obj, $n_cycles) { }
class refno_splitter implements RNCPM\ObjectEventHandler
{
	// Errors that occur during apply() can be found in the info log. (Add
	// Common > Logs to your nav set.) These are aggregated by DQA, so they
	// won't show up in real time.
	public static function apply ($run_mode, $action, $obj, $n_cycles)
	{
		$obj->CustomFields->c->refno_datepart = intval(substr($obj->ReferenceNumber, 0, 6));
		$obj->CustomFields->c->refno_serialpart = intval(substr($obj->ReferenceNumber, 7, 6));
		$obj->save(RNCPHP\RNObject::SuppressAll);
	}
}

// This is the test harness for the event handler implementation. It must be
// present, must be a class, and must implement
// RightNow\CPM\v1\ObjectEventHandler_TestHarness.
//
// Required function signatures:
//   public static function setup() { }
//   public static function fetchObject($action, $object_type) { }
//   public static function validate($action, $object) { }
//   public static function cleanup() { }
class refno_splitter_TestHarness implements RNCPM\ObjectEventHandler_TestHarness
{
    public static function setup()
    {
        return;
    }

    public static function fetchObject($action, $object_type)
    {
		$obj = $object_type::first('ReferenceNumber == \'120720-000010\'');
        if ($obj == NULL)
        {
            $obj = new $object_type;
        }
        return($obj);
    }

    public static function validate($action, $obj)
    {
		// output from echo(), print_r(), fatal errors or uncaught exceptions
		// is presented after the test harness is run.
		// echo "Hi mom!";

	    if ($obj->CustomFields->c->refno_datepart == 120720 && $obj->CustomFields->c->refno_serialpart == 10)
			return(true);
		else
			return(false);
    }

    public static function cleanup()
    {
        return;
    }
}
