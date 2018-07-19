package slot;

import javax.swing.JButton;

abstract class Button extends JButton{
	

	public Button(String text, int x, int y, int width, int height) {
		super(text);
		setBounds(x, y, width, height);
	}

}
