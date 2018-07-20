package button;

import java.awt.Font;

public class StartGameButton extends Button{
	
	public StartGameButton(String text, int x, int y) {
		super(text, x, y, 300, 200);
		setFont(new Font("Arial", Font.BOLD, 100));
	}

}
