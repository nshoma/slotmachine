package slotmachine;

public class ThreadA extends Thread {
	private Flag flag;
	private SlotResult result;
	private int slotNum;
	
	public ThreadA(Flag flag, SlotResult result,int slotNum) {
		this.flag = flag;
		this.result = result;
		this.slotNum = slotNum;
	}
	
	public void run(){
		System.out.println("thread" + slotNum + "start");
		while(true) {
			try {
				for(int i=0; i<3; i++) {
					if(!flag.showStart(slotNum)) {
						System.out.println(slotNum + "+" + i);
						result.setResulet(slotNum, i);
						System.out.println(slotNum +"stop:"+ result.showResult(slotNum));
						return;
					}
				}
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
