package javabootcamp.basic.loops;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//check if a number is prime
//		System.out.println("Please enter a number");
//		int num = scanner.nextInt();
//		for (int i=2 ; i<num;i++) {
//			if(num%i==0) {
//				System.out.println("the number is not prime");
//				return;
//			}
//		}
//		System.out.println("the number is prime");
		
		//*********************
		
		//**********************
		int num=1;
		int sum=1;
		do {
			sum*=num;
			System.out.println("Please enter a number");
		    num = scanner.nextInt();
		}while(num>0);
		System.out.println(num);
		
		if(num == 0)
			System.out.println("Product is 0");
		else
			System.out.println("Product is: "+ sum );
			
		
		
	
		scanner.close();

	}

}
