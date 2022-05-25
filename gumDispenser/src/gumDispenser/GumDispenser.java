package gumDispenser;


public class GumDispenser {
	BalanceState state;
	
	public GumDispenser() {
		this.state = new a0SentState2(this);
	}
	
	
	public void setState(BalanceState state) {
		this.state = state;
	}
	
	
	public void insert(int coin) {
		state.insert(coin);
	}

	
	public void colect() {
		state.colect();
	}
	
	
	
	private void showMenu() {
		String str="Please enter:\r\n"
				  + "1 - if you're inserting a 5 cents coin\r\n"
				  + "2 - if you're inserting a 10 cents coin\r\n"
				  + "3 - To collect the gum...";
		System.out.println(str);
	}
	
	
	
	public void run() {
		System.out.println("Welcome to the Gum dispenser Simulator");
		while(true) {
			showMenu();
		    int opt = Integer.parseInt(Runner.scan.next());
		    switch(opt){
			  case 0: //bye bye
			  case 1:{
				  insert(5);
				  break;
			  }
			  case 2:{
				  insert(10);
				  break;
			  }
			  case 3:{
				  colect();
				  break;
			  }
		    }
		  }
	}
	
	
	
	
	
	
	
	
	
	
	

}
