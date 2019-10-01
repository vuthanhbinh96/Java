package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 1; i <= 10; i++) {
			Runnable woker = new WorkerThread(" " + i);
			executor.execute(woker);
			Thread.sleep(400);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {
			//Running
		}
		
		System.out.println("Finished all threads!");
	}
}
