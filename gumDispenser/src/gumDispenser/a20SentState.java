package gumDispenser;

public class a20SentState extends BalanceState  {

	a20SentState(GumDispenser gumDispenser) {
		super(gumDispenser);
	}


	@Override
	public void insert(int coin) {
		if(coin == 10) {
			System.out.println("the exact amount needs to be inserted to receive a gum.");
			return;
		}
		
		gumDispenser.setState(new ReadyState(gumDispenser));
		System.out.println("Balance: 25");
	}

	
	@Override
	public void colect() {
		System.out.println("prosesing....");
		System.out.println("You need to insert another 5 cents.");
	}

}
