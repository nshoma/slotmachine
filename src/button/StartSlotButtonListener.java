package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import bet.Bet;
import bet.Coin;

public class StartSlotButtonListener implements ActionListener {
	
	Bet bet;
	Coin coin;
	JLabel label;
	
	public StartSlotButtonListener(Bet bet, Coin coin, JLabel label) {
		this.bet = bet;
		this.coin = coin;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(coin.Coinshow() != 0) {
			coin.DecCoin(bet.Betshow());
		}
		label.setText(String.valueOf(coin.Coinshow()));
	}

}
