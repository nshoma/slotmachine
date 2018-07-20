package button;

import java.awt.Font;

public class StartSlotButton extends Button {
	
	public StartSlotButton(String text, int x, int y) {
		super(text, x, y, 300, 200);
		setFont(new Font("Arial", Font.BOLD, 50));
	}
}
