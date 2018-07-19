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
		add(startScreen);
		setVisible(true);
	}
	
	public void change(JPanel panel) {
		getContentPane().removeAll();
		add(panel);
		validate();
		repaint();
	}

}
