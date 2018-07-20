package button;

import java.awt.Font;

public class BetButton extends Button {
	
	public BetButton(String text, int x, int y){
		super(text, x, y, 200, 100);
		setFont(new Font("Arial", Font.BOLD, 50));
	}
	
}
