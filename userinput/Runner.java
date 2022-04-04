package javabootcamo.basic.userinput;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Question 1
        System.out.println("Do you want a cheap or expensive addition? For cheap press 1 for lycra press 2 and without additions press 0");
        int addition = scanner.nextInt();
        
        if(addition <= 0 ||  addition > 2 )
        	System.out.println("The price is: 12");
        if(addition == 1 )
        	System.out.println("The price is: 14");
        if(addition == 2 )
        	System.out.println("The price is: 15");
        
        
        scanner.close();
	}

}
