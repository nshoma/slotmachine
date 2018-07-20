package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bet.Bet;

public class UnitButtonListener implements ActionListener {
	Bet bet;
	Button button;
	
	public UnitButtonListener(Bet bet, Button button){
		this.bet = bet;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bet.IncUnit();
		button.setText(String.valueOf(bet.Unitshow()));
	}
}
