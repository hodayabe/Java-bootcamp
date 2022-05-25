package gumDispenser;

public class a15SentState extends BalanceState  {

	a15SentState(GumDispenser gumDispenser) {
		super(gumDispenser);
	}



	@Override
	public void insert(int coin) {
		if(coin == 5) {
			gumDispenser.setState(new a20SentState(gumDispenser));
			System.out.println("Balance: 20");
			return;
		}
		gumDispenser.setState(new ReadyState(gumDispenser));
		System.out.println("Balance: 25");
	}

	
	@Override
	public void colect() {
		System.out.println("prosesing....");
		System.out.println("You need to insert another 10 cents.");
	}


}
