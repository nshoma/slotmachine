package slot;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGameWindow extends JFrame {
	public Container contentpane;

	public MainGameWindow(String title, int width, int height) {
		super(title);
		contentpane = getContentPane();
		
		StartScreen startScreen = new StartScreen(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		contentpane.add(startScreen);
	}
	
	public void change(JPanel panel) {
		contentpane.removeAll();
		contentpane.add(panel);
		validate();
		repaint();
	}

}
