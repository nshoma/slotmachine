package bet;

public class Bet {
	private int bet;
	private int unit;
	private int coin;
	
	private void check() {
		if(bet > 1000) {
			bet = 1000;
		}else if(bet > coin) {
			bet = coin;
		}
	}
	
	public Bet(){
		bet = 0;
		unit = 1;
	}
	
	public void InitBet() {
		bet = 0;
	}
	
	public void BetAdd(int coin) {
		this.coin = coin;
		bet += unit;
		check();
	}
	
	public int Betshow() {
		return bet;
	}
	
	public void IncUnit() {
		switch (unit) {
		case 1:
			unit = 10;
			break;
		case 10:
			unit = 100;
			break;
		case 100:
			unit = 1;
			break;
		default:
			break;
		}
	}
	
	public int Unitshow() {
		return unit;
	}
}
