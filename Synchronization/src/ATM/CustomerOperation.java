package ATM;

public class CustomerOperation {

	public static void main(String[] args) {
		final Customer customer = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				customer.withdraw(2000);
			}
		};
		
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				customer.deposit(500);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				customer.deposit(3000);
			}
		};
		t2.start();
	}
}
