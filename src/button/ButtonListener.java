package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import slot.MainGameWindow;
import slot.SlotGame;

public class ButtonListener implements ActionListener {
	MainGameWindow frame;
	JPanel nextPanel;
	JLabel label;

	public ButtonListener(MainGameWindow frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.change(new SlotGame(frame));
	}
}