package gumDispenser;

public abstract class BalanceState {

	GumDispenser gumDispenser;
	
	BalanceState(GumDispenser gumDispenser) {
	        this.gumDispenser = gumDispenser;
	    }
	
	public abstract void insert(int coin);
	
    public abstract void colect();
 	
}
