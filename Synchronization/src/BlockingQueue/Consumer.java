package BlockingQueue;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable{

	private final BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				queue.take();
				System.out.println("Consumed resource - Queue size() = " + queue.size());
                Thread.sleep(ThreadLocalRandom.current().nextInt(50, 300)); // simulate time passing
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
