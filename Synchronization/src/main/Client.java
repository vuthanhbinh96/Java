package main;

public class Client {
	
	public static void main(String[] args) {
		ThreadWorker thread1 = new ThreadWorker();
		ThreadWorker thread2 = new ThreadWorker();
		ThreadWorker thread3 = new ThreadWorker();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
