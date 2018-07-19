package slot;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotGame extends JPanel {
	Container contentPane;

	SlotGame(MainGameWindow frame){
		setLayout(null);
		contentPane = frame.getContentPane();
		
		JLabel label = new JLabel("Hello");
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(400, 300, 300, 300);
		contentPane.add(label);
		
		StartGameButton button1 = new StartGameButton("back to start", 400, 500);
		contentPane.add(button1);
		
		button1.addActionListener(new ButtonListener(frame));
	}

}
