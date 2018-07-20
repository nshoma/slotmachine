package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import slot.MainGameWindow;
import slot.StartScreen;

public class BackButtonListener implements ActionListener {
	
	MainGameWindow frame;
	
	public BackButtonListener(MainGameWindow frame){
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.change(new StartScreen(frame));
	}

}
