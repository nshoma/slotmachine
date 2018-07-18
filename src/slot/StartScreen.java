package slot;

import java.awt.Container;

import javax.swing.JFrame;

public class StartScreen {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Start");
		Container contentPane = frame.getContentPane();
		
		Button button = new Button("push");
		contentPane.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,100);
		frame.setVisible(true);
	}
}