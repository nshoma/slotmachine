package slot;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import bet.Bet;
import bet.Coin;
import button.BackButton;
import button.BackButtonListener;
import button.BetButton;
import button.BetButtonListener;
import button.StartSlotButton;
import button.StartSlotButtonListener;
import button.UnitButton;
import button.UnitButtonListener;

public class SlotGame extends JPanel {
	Container contentPane;
	private Bet bet;
	private Coin coin;

	public SlotGame(MainGameWindow frame){
		setLayout(null);
		contentPane = frame.getContentPane();
		bet = new Bet();
		coin = new Coin();
		
		JLabel betcoin = new JLabel(String.valueOf(bet.Betshow()));
		betcoin.setBounds(1500, 800, 200, 100);
		betcoin.setFont(new Font("Arrial", Font.BOLD, 50));
		add(betcoin);
		
		JLabel havecoin = new JLabel(String.valueOf(coin.Coinshow()));
		havecoin.setBounds(1800, 800, 200, 100);
		havecoin.setFont(new Font("Arrial",  Font.BOLD,  50));
		add(havecoin);
		
		BackButton backbutton = new BackButton("BACK", 100, 100);
		add(backbutton);
		backbutton.addActionListener(new BackButtonListener(frame));
		
		BetButton betButton = new BetButton("Bet", 1800, 1000);
		add(betButton);
		betButton.addActionListener(new BetButtonListener(coin, bet, betcoin));
		
		UnitButton unitButton = new UnitButton(String.valueOf(bet.Unitshow()), 1500, 1000);
		add(unitButton);
		unitButton.addActionListener(new UnitButtonListener(bet, unitButton));
		
		StartSlotButton ssButton = new StartSlotButton("START", 1000, 1000);
		add(ssButton);
		ssButton.addActionListener(new StartSlotButtonListener(bet, coin, havecoin));
	}
}
