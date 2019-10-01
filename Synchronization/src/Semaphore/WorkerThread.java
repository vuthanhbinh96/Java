package Semaphore;

import java.util.concurrent.Semaphore;

public class WorkerThread extends Thread{

	private final Semaphore semaphore;
	private String name;
	
	public WorkerThread(Semaphore semaphore, String name) {
		this.semaphore = semaphore;
		this.name = name;
	}
	
	public void run() {
		try {
			System.out.println(name + ": acquiring lock...");
			System.out.println(name + ": available Semaphore permits now: " + semaphore.availablePermits());
			semaphore.acquire();
			System.out.println(name + ": got the permit!");
			
			try {
				System.out.println(name + ": is performing operation, available Semaphore permits : "
                        + semaphore.availablePermits());
                Thread.sleep(100);
			} finally {
				System.out.println(name + ": releasing lock...");
                semaphore.release();
                System.out.println(name + ": available Semaphore permits now: " + semaphore.availablePermits());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
