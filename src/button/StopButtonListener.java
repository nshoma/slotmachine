package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import slotmachine.Flag;
import slotmachine.SlotResult;

public class StopButtonListener implements ActionListener {
	Flag flag;
	SlotResult result;
	int slotNum;
	JLabel label;
	int stop;
	
	public StopButtonListener(Flag flag, SlotResult result, int slotNum, JLabel l, int stop){
		this.flag = flag;
		this.result = result;
		this.slotNum = slotNum;
		label = l;
		this.stop = stop;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			flag.endSlot(slotNum);
			label.setText(String.valueOf(result.showResult(slotNum)));
			stop++;
			Thread.sleep(100);
			
		}catch (InterruptedException error) {
			// TODO: handle exception
		}
	}

}
