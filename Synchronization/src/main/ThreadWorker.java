package main;

public class ThreadWorker extends Thread{

	@Override
	public void run() {
		SynchronizationExample.lockedBySynchronizedBlock();
	}
}
