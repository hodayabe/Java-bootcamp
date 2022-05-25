package gumDispenser;

public class a0SentState2 extends BalanceState  {

	a0SentState2(GumDispenser gumDispenser) {
		super(gumDispenser);
	}


	@Override
	public void insert(int coin) {
		if(coin == 5) {
			gumDispenser.setState(new a5SentState(gumDispenser));
			System.out.println("Balance: 5");
			return;
		}
		gumDispenser.setState(new a10SentState(gumDispenser));
		System.out.println("Balance: 10");
	}

	
	@Override
	public void colect() {
		System.out.println("prosesing....");
		System.out.println("You need to insert another 25 cents.");
	}



}
