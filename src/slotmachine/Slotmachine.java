package slotmachine;

public class Slotmachine {
	private Flag flag;
	private SlotResult result;
	
	public Slotmachine( Flag flag, SlotResult result) {
		this.flag = flag;
		this.result = result;
	}
	
	public void SlotMovement() {	
		ThreadA th1 = new ThreadA(flag, result, 1);
		ThreadA th2 = new ThreadA(flag, result, 2);
		ThreadA th3 = new ThreadA(flag, result, 3);
		
		th1.start();
		th2.start();
		th3.start();
	}
	
	public SlotResult slotResult() {
		return result;
	}
}
