package javabootcamp.basic.condition;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Question 3

		int sofa = 5000;
		int Table = 3000;
		System.out.println("What furniture are you interested in buying? 1- sofa, 2- table");
		int furniture = scanner.nextInt();
		System.out.println("How much does the sofa weigh?");
		double weigh = scanner.nextDouble();
		System.out.println("How many miles away is your home");
		double km = scanner.nextDouble();
		System.out.println("What floor do you live on?");
		double floor = scanner.nextDouble();
		double sum;
		if(furniture==sofa)
			sum = 5000 +(5000*0.1) + (weigh*0.1) +(5*km)+floor;
		else
			sum = 3000 +(3000*0.1) + (weigh*0.1) +(5*km)+floor;

		scanner.close();


	}

}
