package slotmachine;

public class SlotResult {
	private int slotResult1;
	private int slotResult2;
	private int slotResult3;
	
	public SlotResult() {
		slotResult1 = 0;
		slotResult2 = 0;
		slotResult3 = 0;
	}
	
	public int showResult(int slotNum) {
		switch (slotNum) {
		case 1:
			return slotResult1;
		case 2:
			return slotResult2;
		case 3:
			return slotResult3;
		default:
			return 0;
		}
	}
	
	public void setResulet(int slotNum, int result) {
		switch (slotNum) {
		case 1:
			slotResult1 = result;
			break;
		case 2:
			slotResult2 = result;
			break;
		case 3:
			slotResult3 = result;
			break;
		}
	}
}
