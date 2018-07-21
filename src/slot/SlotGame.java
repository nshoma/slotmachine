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
import button.StopButton;
import button.StopButtonListener;
import button.UnitButton;
import button.UnitButtonListener;
import slotmachine.Flag;
import slotmachine.SlotResult;
import slotmachine.Slotmachine;

public class SlotGame extends JPanel {
	Container contentPane;
	private Bet bet;
	private Coin coin;
	JLabel[] slot = new JLabel[3];
	SlotResult result = new SlotResult();
	Flag flag = new Flag();
	int stop = 0;

	public SlotGame(MainGameWindow frame){
		setLayout(null);
		contentPane = frame.getContentPane();
		bet = new Bet();
		coin = new Coin();
		Slotmachine slotmachine = new Slotmachine(flag, result);
		
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
		ssButton.addActionListener(new StartSlotButtonListener(bet, coin, havecoin, slotmachine, flag));
		
		setSlotScreen();
		
		StopButton stopButton1 = new StopButton(null, 1000, 600);
		add(stopButton1);
		stopButton1.addActionListener(new StopButtonListener(flag, result, 1, slot[0], stop));
		
		StopButton stopButton2 = new StopButton(null, 1200, 600);
		add(stopButton2);
		stopButton2.addActionListener(new StopButtonListener(flag, result, 2, slot[1], stop));
		
		StopButton stopButton3 = new StopButton(null, 1400, 600);
		add(stopButton3);
		stopButton3.addActionListener(new StopButtonListener(flag, result, 3, slot[2], stop));
		
		endSlot();
	}
	
	private void setSlotScreen() {
		int x = 1000;
		int y = 400;
		int screen[] = new int[3];
		int add = 0;
		
		for(int i=0; i<3; i++) {
			screen[i] = result.showResult(i);
		}
		
		for(int i=0; i<3; i++) {
			slot[i] = new JLabel(String.valueOf(screen[i]));
			slot[i].setBounds(x, y, 200, 200);
			slot[i].setFont(new Font("Arrial", Font.BOLD, 200));
			add(slot[i]);
			x += 200;
		}
	}
	
	public void endSlot() {
		stop++;
		if(stop == 3) {
			if(result.showResult(1) == result.showResult(2) && result.showResult(2) == result.showResult(3)) {
				coin.AddCoin(bet.Betshow()*10);
				JLabel endSlot = new JLabel("excellent!");
				endSlot.setBounds(1800, 800, 200, 100);
				endSlot.setFont(new Font("Arrial",  Font.BOLD,  50));
				add(endSlot);
				System.out.println("excellent!");
			}else {
				JLabel endSlot = new JLabel("OH my God!");
				endSlot.setBounds(1800, 800, 200, 100);
				endSlot.setFont(new Font("Arrial",  Font.BOLD,  50));
				add(endSlot);
				System.out.println("OH my God!");
			}
			stop = 0;
		}
	}
}
