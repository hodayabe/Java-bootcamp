package gumDispenser;

public class ReadyState extends BalanceState {

	ReadyState(GumDispenser gumDispenser) {
		super(gumDispenser);
	}
	
	@Override
	public void insert(int coin) {
		System.out.println("firs colect the gum");
	}

	
	@Override
	public void colect() {
		System.out.println("prosesing....");
		System.out.println("yayyy gum");
		gumDispenser.setState(new a0SentState2(gumDispenser));
	}
	
	
	

}
