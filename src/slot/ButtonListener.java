package slot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ButtonListener implements ActionListener {
	MainGameWindow frame;
	JPanel nextPanel;

	public ButtonListener(MainGameWindow frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.change(new SlotGame(frame));
	}
}
