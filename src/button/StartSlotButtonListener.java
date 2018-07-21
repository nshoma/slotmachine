package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import bet.Bet;
import bet.Coin;
import slotmachine.Flag;
import slotmachine.Slotmachine;

public class StartSlotButtonListener implements ActionListener {
	
	Bet bet;
	Coin coin;
	JLabel label;
	Slotmachine slotmachine;
	Flag flag;
	
	public StartSlotButtonListener(Bet bet, Coin coin, JLabel label, Slotmachine slotmachine, Flag flag) {
		this.bet = bet;
		this.coin = coin;
		this.label = label;
		this.slotmachine = slotmachine;
		this.flag = flag;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(coin.Coinshow() != 0) {
			coin.DecCoin(bet.Betshow());
		}
		label.setText(String.valueOf(coin.Coinshow()));
		flag.startSlot();
		slotmachine.SlotMovement();
	}

}
