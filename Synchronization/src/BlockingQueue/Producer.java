package BlockingQueue;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable{

	private final BlockingQueue<Integer> queue;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				queue.put(produce());
				System.out.println("Produced resource - Queue size() = "  + queue.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Integer produce() throws InterruptedException {
		Thread.sleep(50);
		return ThreadLocalRandom.current().nextInt(1, 100);
	}
}
