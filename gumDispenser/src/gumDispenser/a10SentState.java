package gumDispenser;

public class a10SentState extends BalanceState  {

	a10SentState(GumDispenser gumDispenser) {
		super(gumDispenser);
	}


	@Override
	public void insert(int coin) {
		if(coin == 5) {
			gumDispenser.setState(new a15SentState(gumDispenser));
			System.out.println("Balance: 15");
			return;
		}
		gumDispenser.setState(new a20SentState(gumDispenser));
		System.out.println("Balance: 20");
		
	}

	
	@Override
	public void colect() {
		System.out.println("prosesing....");
		System.out.println("You need to insert another 15 cents.");
	}


}
