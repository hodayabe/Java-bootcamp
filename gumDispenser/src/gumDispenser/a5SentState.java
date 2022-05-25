package gumDispenser;

public class a5SentState extends BalanceState  {

	a5SentState(GumDispenser gumDispenser) {
		super(gumDispenser);
	}


	@Override
	public void insert(int coin) {
		if(coin == 5) {
			gumDispenser.setState(new a10SentState(gumDispenser));
			System.out.println("Balance: 10");
			return;
		}
		gumDispenser.setState(new a15SentState(gumDispenser));
		System.out.println("Balance: 15");
		
	}

	
	@Override
	public void colect() {
		System.out.println("prosesing....");
		System.out.println("You need to insert another 20 cents.");
	}



}
