package main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static final int NUM_OF_THREAD = 2;
	public static final int INITIAL_DELAY = 1;
	public static final int DELAY = 3;
	
	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(NUM_OF_THREAD);
		
		for(int i = 1; i <= 10; i++) {
			Runnable woker = new WorkerThread("" + i);
			executor.scheduleWithFixedDelay(woker, INITIAL_DELAY, DELAY, TimeUnit.SECONDS);
		}
		
		executor.awaitTermination(10, TimeUnit.SECONDS);
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {
			//Running...
		}
		
		System.out.println("Finished all threads!");
	}
}
