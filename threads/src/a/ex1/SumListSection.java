package a.ex1;

public class SumListSection implements Runnable{
	
	private int start;
	private int end;
	private EXE1 runner;
	
	
	public SumListSection(int start, int end, EXE1 runner) {
		this.start = start;
		this.end = end;
		this.runner = runner;
	}


	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			//synchronized (runner) {
				runner.addToSum(i);
			//}
			
		}
		
	}

}
