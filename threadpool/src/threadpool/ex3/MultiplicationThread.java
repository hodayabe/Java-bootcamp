package threadpool.ex3;

public class MultiplicationThread implements Runnable{

	int i;
	int j;
	
	
	
	
	public MultiplicationThread(int i, int j) {
		this.i = i;
		this.j = j;
	}


	@Override
	public void run() {
		
		for (int k = 0; k < Runner.MAT_SIZE; k++) {
			Runner.matC2[i][j]+=(Runner.matA[i][k] *Runner. matB[k][i]);
		}
		
	}
	

}
