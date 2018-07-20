package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import bet.Bet;
import bet.Coin;

public class BetButtonListener implements ActionListener {
	
	Bet bet;
	Coin coin;
	JLabel label1;
	
	public BetButtonListener(Coin coin, Bet bet, JLabel label1){
		this.bet = bet;
		this.coin = coin;
		this.label1 = label1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bet.BetAdd(coin.Coinshow());
		label1.setText(String.valueOf(bet.Betshow()));
	}

}
