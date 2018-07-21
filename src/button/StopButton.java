package button;

import java.awt.Font;

public class StopButton extends Button {
	public StopButton(String text, int x, int y){
		super(text, x, y, 100, 100);
		setFont(new Font("Arial", Font.BOLD, 50));
	}
}
