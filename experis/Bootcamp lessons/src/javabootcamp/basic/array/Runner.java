package javabootcamp.basic.array;

public class Runner {

	public static void main(String[] args) {
		
	int	originalArr[]= {1,2,3,4,5};
	int	arrCopy[]= new int[originalArr.length];
	
	for (int i = 0; i < arrCopy.length; i++) {
		arrCopy[i]=originalArr[i]*originalArr[i];
	}
	
	for (int i = 0; i < arrCopy.length; i++) {
		System.out.print(originalArr[i]+",");
	}
	System.out.println("");
	
	for (int i = 0; i < arrCopy.length; i++) {
		System.out.print(arrCopy[i]+",");
	}
	
	}

}
