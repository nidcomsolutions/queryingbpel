package de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage;

/**
 * Maps the activity types of the bpel-activities to an <code>int<code> value.
 * 
 * @author Daniel Gerlach
 *
 */
public class ActivityType {

	// basic activities
	public static final int INVOKE = 0;
	public static final int RECEIVE = 1;
	public static final int REPLY = 2;
	public static final int ASSIGN = 3;
	public static final int THROW = 4;
	public static final int WAIT = 5;
	public static final int EMPTY = 6;
	public static final int RETHROW = 7;
	public static final int EXIT = 8;
	public static final int EXTENSIONACTIVITY = 9;

	// structured activities
	public static final int SEQUENCE = 100;
	public static final int IF = 101;
	public static final int WHILE = 102;
	public static final int REPEATUNTIL = 103;
	public static final int PICK = 104;
	public static final int FLOW = 105;
	public static final int FOREACH = 106;
	public static final int SCOPE = 107;

	// helper activities(in bpel not real activities) for keeping the structure
	// of the bpel processes

	public static final int ONMESSAGE = 200;
	public static final int ONALARMPICK = 201;
	public static final int ELSEIFBRANCH = 202;
	public static final int ELSEBRANCH = 203;

	/**
	 * Returns the appropriate number for the given activity type. Returns 999
	 * if activity is not known.
	 * 
	 * @param activity
	 *            The activity for which the appropriate number for the type is
	 *            specified and returned.
	 * @return an appropriate int value for the given activity.
	 */
	public static final int getActivityType(Activity activity) {
		String activityType = activity.getClass().getSimpleName();

		// basic activities
		if (activityType.equals("InvokeImpl")) {
			return 0;
		} else if (activityType.equals("ReceiveImpl")) {
			return 1;
		} else if (activityType.equals("ReplyImpl")) {
			return 2;
		} else if (activityType.equals("AssignImpl")) {
			return 3;
		} else if (activityType.equals("ThrowImpl")) {
			return 4;
		} else if (activityType.equals("WaitImpl")) {
			return 5;
		} else if (activityType.equals("EmptyImpl")) {
			return 6;
		} else if (activityType.equals("RethrowImpl")) {
			return 7;
		} else if (activityType.equals("ExitImpl")) {
			return 8;
		} else if (activityType.equals("ExtensionActivityImpl")) {
			return 9;

			// structured activities
		} else if (activityType.equals("SequenceImpl")) {
			return 100;
		} else if (activityType.equals("IfImpl")) {
			return 101;
		} else if (activityType.equals("WhileImpl")) {
			return 102;
		} else if (activityType.equals("RepeatUntilImpl")) {
			return 103;
		} else if (activityType.equals("PickImpl")) {
			return 104;
		} else if (activityType.equals("FlowImpl")) {
			return 105;
		} else if (activityType.equals("ForEachImpl")) {
			return 106;
		} else if (activityType.equals("ScopeImpl")) {
			return 107;
		}

		// only returns 999 if activity type doesn't exist
		return 999;
	}

	/**
	 * Returns the appropriate number for the given structureHelper object
	 * (onMessage, onAlarmPick, ElseIf, Else). If structureHelper is unknown 999
	 * will be returned.
	 * 
	 * @param structureHelper
	 */
	public static final int getStuctureHelperType(
			ExtensibleElements structureHelper) {

		if (structureHelper instanceof OnMessage) {
			return ONMESSAGE;
		} else if (structureHelper instanceof OnAlarmPick) {
			return ONALARMPICK;
		} else if (structureHelper instanceof Elseif) {
			return ELSEIFBRANCH;
			// no extra class for else branch in an If activity
			// TODO
			// by extension on this, take care or add a special class for "else"
		} else if (structureHelper instanceof ActivityContainer) {
			return ELSEBRANCH;
		}

		return 999;
	}

	/**
	 * Returns a string which holds the name of the structureHelperType.
	 * 
	 * @param structureHelperType
	 * @return appropriate name for the given structureHelperType
	 */
	public static final String getStructureHelperName(int structureHelperType) {

		if (structureHelperType == ONMESSAGE) {
			return "ONMESSAGE";
		} else if (structureHelperType == ONALARMPICK) {
			return "ONALARMPICK";
		} else if (structureHelperType == ELSEIFBRANCH) {
			return "ELSEIFBRANCH";
			// no extra class for else branch in an If activity
		} else if (structureHelperType == ELSEBRANCH) {
			return "ELSEBRANCH";
		}
		return null;
	}

}
