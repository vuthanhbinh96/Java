package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

	public static final int NUM_OF_THREAD = 5;
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(NUM_OF_THREAD);
		
		for(int i = 0; i<= 10; i++) {
			Runnable woker = new WorkerThread(" " + i);
			executor.execute(woker);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {
			//Running...
		}
		
		System.out.println("Finished all threads!");
		
	}
}
