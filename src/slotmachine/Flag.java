package slotmachine;

public class Flag {
	private boolean isStart1;
	private boolean isStart2;
	private boolean isStart3;
	
	public Flag() {
		isStart1 = true;
		isStart2 = true;
		isStart3 = true;
	}
	
	synchronized boolean showStart(int slotNum) throws InterruptedException{
		switch (slotNum) {
		case 1:
			return isStart1;
		case 2:
			return isStart2;
		case 3:
			return isStart3;
		default:
			return true;
		}
	}
	
	synchronized public void endSlot(int slotNum) throws InterruptedException{
		switch (slotNum) {
		case 1:
			isStart1 = false;
		case 2:
			isStart2 = false;
		case 3:
			isStart3 = false;
		}
	}
	
	public void startSlot(){
		isStart1 = true;
		isStart2 = true;
		isStart3 = true;
	}
}
