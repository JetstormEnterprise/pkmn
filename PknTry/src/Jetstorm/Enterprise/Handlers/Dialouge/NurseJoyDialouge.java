package Jetstorm.Enterprise.Handlers.Dialouge;

public class NurseJoyDialouge {

	public static int conversation;
	public static String line1, line2;
	public static int currentSpot, maxSpot;

	public static String getLine1() {
		if (conversation == 0) {
			if (currentSpot == 0) {
				line1 = "Testing text";
			} else if (currentSpot == 1) {
				line1 = "TestSSDFSDF";
			} else if (currentSpot == 2) {
				line1 = "fsidfoisn";
			}
		}
		return line1;
	}

	public static String getLine2() {
		if (conversation == 0) {
			if (currentSpot == 0) {
				line2 = "Testing box";
			} else if (currentSpot == 1) {
				line2 = "efw wf wf wf";
			} else if (currentSpot == 2) {
				line2 = "gergegreg";
			}
		}
		return line2;
	}

	public static int getMaxSpot() {
		if (conversation == 0) {
			maxSpot = 2;
		} else if (conversation == 1) {
			maxSpot = 3;
		}
		return maxSpot;
	}

}
