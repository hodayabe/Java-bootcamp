package javabootcamp.basic.methods;

import java.util.Scanner;
import java.lang.Math;

public class Runner {

	public static void printName() {
		System.out.println("Hodaya David");
	}

	public static void printAge() {
		System.out.println("23");
	}

	public static double getAverage() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter 3 greads");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		return (num1 + num2 + num3) / 3.0;
	}

	public static void average(int num1, int num2, int num3) {
		System.out.println((num1 + num2 + num3) / 3.0);
	}

	public static int maximum(int num1, int num2, int num3) {
		int max = num1;
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		return max;
	}

	public static int maximum(int num1, int num2) {
		int max = num1;
		if (max < num2)
			max = num2;
		return max;
	}

	public static int[] buildArray(int[] arr) {
		int[] array = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 201 - 100);
		}
		return array;
	}

	/**
	 * 
	 * @param longerArr  must be the longer array or else method will throw an
	 *                   exception
	 * @param shorterArr
	 * @return
	 */
	public static int[] sumOfArrays(int[] longerArr, int[] shorterArr) {
		
		if(shorterArr.length>longerArr.length) {
			//throw an exception
			System.exit(1);
		}
		
		int[] sumArray;

		sumArray = new int[longerArr.length];
		// summarize arrays
		int i = 0;
		for (; i < shorterArr.length; i++) {
			sumArray[i] = shorterArr[i] + longerArr[i];
		}

		for (; i < longerArr.length; i++) {
			sumArray[i] = longerArr[i];
		}

		return sumArray;

	}

	public static void putArraySumInLongerArray(int[] arr1, int[] arr2) {
		// find which array is longer
		int[] longerArr = arr1, shorterArr = arr2;
		if (longerArr.length < shorterArr.length) {
			longerArr = arr2;
			shorterArr = arr1;
		}
		 //not working
		arr1 =  sumOfArrays(longerArr, shorterArr);
//		
		// deep copy of the array sum to the longer array
		int[] sumArr = sumOfArrays(longerArr, shorterArr);
		
		for (int i = 0; i < sumArr.length; i++) {
			longerArr[i] = sumArr[i];
		}

	}


	
	public static int[] concatArray(int[] arr1, int[] arr2) {
		int[]concat=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			concat[i] = arr1[i];
		}
		for (int i=0; i < arr2.length; i++) {
			concat[i+arr1.length] = arr2[i];
		}
		return concat;
	}
	
	
	public static void printArr(int[]arr) {
		for (int i=0; i < arr.length; i++) 
			System.out.print(arr[i]+",");
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.out.print("enter 3 greads");
		// int num1=scanner.nextInt();
		// int num2=scanner.nextInt();
		// int num3=scanner.nextInt();

		// average(num1,num2,num3);
		//
		// System.out.println(maximum(1,2));
		// System.out.println(maximum(1,7,3));
//
//		//1.
//		double x=10*Math.sin(Math.PI/4);

//		
		int[] arr1 = { 3, 2, 1 };
		int[] arr2 = { 1, 2, 2, 1 };
//
//		putArraySumInLongerArray(arr1, arr2);

		int[] arr=concatArray(arr1,arr2);
		printArr(arr);
		
		
		
		
		scanner.close();
	}

}
