package button;

import java.awt.Font;

public class BackButton extends Button {
	
	public BackButton(String text, int x, int y){
		super(text, x, y, 300, 100);
		setFont(new Font("Arial", Font.BOLD, 50));
	}
	
}
