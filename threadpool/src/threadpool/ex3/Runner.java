package threadpool.ex3;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

	static final int MAT_SIZE = 3;
	static int[][] matA = new int[MAT_SIZE][MAT_SIZE];
	static int[][] matB = new int[MAT_SIZE][MAT_SIZE];
	static int[][] matC1 = new int[MAT_SIZE][MAT_SIZE];
	static int[][] matC2 = new int[MAT_SIZE][MAT_SIZE];
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		init();
		multiplication();
		printMat(matC1);

		ExecutorService executorService = Executors.newFixedThreadPool( MAT_SIZE*MAT_SIZE);

		

//		 for (; i < MAT_SIZE; i++) {
//				for (; j < MAT_SIZE; j++) {
//					executorService.execute(() ->{
//						for (int k = 0; k < MAT_SIZE; k++) {
//							matC2[i][j]+=(matA[i][k] * matB[k][i]);
//						}
//					});
//					
//					}		
//				}
//		 
		 
				
		
		
	}

	public static void init() {
		for (int i = 0; i < MAT_SIZE; i++)
			for (int j = 0; j < MAT_SIZE; j++) {
				matA[i][j] = 1;
				matB[i][j] = 1;
			}
	}

	public static void printMat(int[][] mat) {
		for (int i = 0; i < MAT_SIZE; i++) {
			for (int j = 0; j < MAT_SIZE; j++)
				System.out.print(mat[i][j] + "  ");
			System.out.println("");
		}
	}

	public static void multiplication() {
		for (int i = 0; i < MAT_SIZE; i++) {
			for (int j = 0; j < MAT_SIZE; j++) {
				for (int k = 0; k < MAT_SIZE; k++) {
					matC1[i][j] += (matA[i][k] * matB[k][i]);
				}
			}
		}
	}

}