package Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	
	public static final int PERMITS = 1;

	private static Semaphore semaphore = new Semaphore(PERMITS);
	
	public static void main(String[] args) {
		System.out.println("Total available Semaphore permits: " + semaphore.availablePermits());
		for (int i = 0; i <= 6; i++) {
			WorkerThread woker = new WorkerThread(semaphore, "ATM " + i);
			woker.start();
		}
	}
	
}
