package slot;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Button extends JPanel implements ActionListener{
	
	private String text;
	private JLabel label;
	
	Button(String text){
		this.text = text;
		setLayout(new BorderLayout());
		label = new JLabel("Enjoy Java!");
		this.add(label, BorderLayout.NORTH);
		
		JButton button = new JButton(text);
		this.add(button, BorderLayout.CENTER);
		
		ButtonListener bl = new ButtonListener(label);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
