package bet;

public class Coin {
	private int coin;
	
	public Coin(){
		coin = 100;
	}
	
	public void AddCoin(int getCoin){
		coin += getCoin;
	}
	
	public void DecCoin(int bet) {
		coin -= bet;
	}
	
	public int Coinshow() {
		return coin;
	}
	
}
