package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		for(int i = 0; i <= 10; i++) {
			Runnable woker = new WorkerThread("" + i);
			executor.execute(woker);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {
			//Running...
		}
		
		System.out.println("Finished all threads!");
	}
	
}
