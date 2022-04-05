package javabootcamp.basic.ex3_4;

import java.util.Iterator;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//3
		//Q3
//		int sum =0;
//		int question;
//		System.out.println("Relative - 1 ,friend - 2 ,other - 3");
//		int closeness = scanner.nextInt();
//		
//		if( closeness==1)
//			sum=1000;
//		else if(closeness==2)
//			sum=500;
//		else
//			sum=250;
//		
//		
//		if(closeness!=1) {
//			System.out.println("Has the acquaintance with one of the spouses been over 3 years: yes-1,no-2");
//			question = scanner.nextInt();
//			if(question==1)
//				sum+=50;
//				
//			System.out.println("Is the travel time for the wedding over an hour: yes -1, no-2");
//			question = scanner.nextInt();
//			if(question==1)
//				sum-=50;
//		}
//		
//		System.out.println("You need to put in the check: "+ sum);
//		
		
		
		//Q7
			 
//		double f_score=0;
//		System.out.println("Enter an exam score:");
//		int score = scanner.nextInt();
//		System.out.println("Enter average exercises");
//		int average = scanner.nextInt();
//		System.out.println("Enter a number of exercises");
//		int exercise = scanner.nextInt();
//		
//		if(average==5 || average==6) {
//			if(score<54)
//				f_score= score;
//			else
//				f_score= (score*0.8 + average*0.2);
//		}
//		else if(average==7 || average==8) {
//			if(score<54) {
//				if(average>80) {
//					if((score*0.75 + average*0.25)>score)
//						f_score= (score*0.75 + average*0.25);
//					else
//						f_score= score;
//				}
//				else{//(average<=80)
//					if((score*0.8 + average*0.2)>score)
//						f_score= (score*0.75 + average*0.25);
//					else
//						f_score= score;
//				}
//			}
//			else {
//				f_score= (score*0.7 + average*0.3);
//			}
//		}
//		System.out.println("The final score is: "+ f_score);
		
			
		//4***************************************************
		//Q2
//		int newNum=0,temp=0,ten=1;
//		System.out.println("Enter a number:");
//		int num = scanner.nextInt();
//		while(num!=0) {
//			temp=num%10;
//			newNum+=temp*ten;
//			num/=100;
//			ten*=10;
//		}
//		System.out.println("number: "+num+" new number: "+newNum);
	
		
		//Q4
//		int sum=0,tempSum=0;
//		System.out.print("Enter id number:");
//		int id =scanner.nextInt();
//		int idCopy=id/10;
//		int checkDigit=id%10;
//		while(idCopy!=0) {
//			sum+=idCopy%10;//(digit*1)
//			idCopy/=10;
//			sum+=(idCopy%10)*2;//(digit*1)
//			idCopy/=10;
//		}
//		tempSum=((sum/10)+1)*10;//Complement to the nearest multiple of 10 upwards
//		if((tempSum-sum)==checkDigit)
//			System.out.println("Proper ID number");
//		else
//			System.out.println("Incorrect ID number");
	
		
		//Q6
//		
//		System.out.print("Enter id number:");
//		int num =scanner.nextInt();
//		int temp=num;
//		while(temp!=0) {
//			num=(num*10)+(temp%10);
//			temp/=10;
//		}
//		System.out.println(num);
		
		
		//Q8
//		int cnt=0;
//		for(int numerator=10; numerator<99; numerator++) {
//			for(int denominator=11; denominator<100; denominator++) {
//				if((denominator%10) ==0 )//Not divided by 0
//					denominator++;
//					
//				if((numerator/10)/(denominator%10)==numerator/denominator) {
//					System.out.print(numerator+"/"+denominator+",");
//					cnt++;
//				}
//				if(cnt==48)
//					break;
//			}	
//		}
		
		//Q10
		
//		System.out.print("Enter a number:");
//		int num =scanner.nextInt();
//		System.out.print("Enter a digit:");
//		int digit =scanner.nextInt();
//		int tempNum=num,temp;
//		int newNum=0;
//		int i,ten=1;
//		while(tempNum!=0) {
//			i=0;
//			temp=0;
//			//Divides the number by the digit and turns
//			while(i<digit && tempNum!=0) {
//				temp=(temp*10)+(tempNum%10);
//				tempNum/=10;
//				i++;
//			}
//			i=0;
//			temp*=ten;
//			newNum+=temp;
//			while(i<digit) {
//				ten*=10;
//				i++;
//			}   
//		}
//		
//		System.out.println("number: "+num+ "new num: "+newNum);
//		
		
		//Q12
		
//		System.out.print("Enter a number:");
//		int num =scanner.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			for(int j=0;j<num;j++) {
//				if(j>=i)
//					System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		//Q14
		
//		System.out.print("Enter a number:");
//		int num =scanner.nextInt();
//		for(int k=0;k<num;k++) {
//			for (int i = 0; i < num; i++) {
//				for(int j=0;j<num;j++) {
//					System.out.print("*");
//				}
//				System.out.print(" ");
//			}
//			System.out.println(" ");	
//		}
		
		//Q16
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		scanner.close();

	}

}
