package JavaBootcamp.oop.Polymorphism.VendingMachineRunner;

import java.util.Scanner;

import JavaBootcamp.oop.Polymorphism.VendingMachine.AppleJuice;
import JavaBootcamp.oop.Polymorphism.VendingMachine.Cappuccino;
import JavaBootcamp.oop.Polymorphism.VendingMachine.Cola;
import JavaBootcamp.oop.Polymorphism.VendingMachine.Espresso;
import JavaBootcamp.oop.Polymorphism.VendingMachine.HotChocolate;
import JavaBootcamp.oop.Polymorphism.VendingMachine.Latte;
import JavaBootcamp.oop.Polymorphism.VendingMachine.OrangeJuice;
import JavaBootcamp.oop.Polymorphism.VendingMachine.Produceable;
import JavaBootcamp.oop.Polymorphism.VendingMachine.Sprite;

public class VendingMachine_Runner {
	public static int milkQtt;
	public static int waterQtt;
	public static int MAX_VOLUME;

	static {
	  milkQtt = 1000;
	  waterQtt = 2000;
	}
	
	
	private static Produceable createDrink(int opt) {
		  switch(opt){
		  case 0: //bye bye
		  case 1: return new HotChocolate();
		  case 2: return new Espresso();
		  case 3: return new Cappuccino();
		  case 4: return new Latte();
		  case 5: return new Cola();
		  case 6: return new Sprite();
		  case 7: return new OrangeJuice();
		  case 8: return new AppleJuice(); 
		  }
		return null;
		}

		public static void showMenu() {
		  System.out.println("Please select a drink or enter 0 to exit:");
		  System.out.println("1. Hot Chocolate\n" + "2. Hot Espresso\n" + "3. Hot Cappuccino\n" + "4. Hot Latte\n"
		+ "5. Cola\n" + "6. Sprite\n" + "7. Orange Juice\n" + "8. Apple Juice");
		}


	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  while(MAX_VOLUME<=milkQtt || MAX_VOLUME<=waterQtt) {
	    showMenu();
	    int opt = Integer.parseInt(sc.next());
	    if(opt == 0)
	      break;
	    Produceable drink = createDrink(opt);
	    drink.produce();
	    System.out.println("");
	  }
	}

	
}
