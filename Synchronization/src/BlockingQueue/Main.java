package BlockingQueue;

public class Main {

	public static void main(String[] args) throws InterruptedException {
	
		BlockingQueue<Integer> boundedBuffer = new BlockingQueue<Integer>();
		
		Producer producer = new Producer(boundedBuffer);
		Consumer consumer = new Consumer(boundedBuffer);
		Consumer consumer2 = new Consumer(boundedBuffer);
		Consumer consumer3 = new Consumer(boundedBuffer);
		
		new Thread(producer).start();
		new Thread(consumer).start();
		new Thread(consumer2).start();
		new Thread(consumer3).start();
		
		Thread.sleep(5000);
		Consumer consumer4 = new Consumer(boundedBuffer);
		
		new Thread(consumer4).start();
	}
	
}
