package slot;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import button.ButtonListener;
import button.StartGameButton;

public class StartScreen extends JPanel{
	Container contentPane;
	
	public StartScreen(MainGameWindow frame) {
		setLayout(null);
		contentPane = frame.getContentPane();
		
		JLabel label = new JLabel("	SLOT MACHINE");
		label.setFont(new Font("Arial", Font.BOLD, 100));
		label.setBounds(300, 100, 1000, 300);
		add(label);
		
		StartGameButton button1 = new StartGameButton("start", 550, 500);
		add(button1);
		
		button1.addActionListener(new ButtonListener(frame));
	}
}