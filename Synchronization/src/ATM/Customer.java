package ATM;

public class Customer {

	private int balance = 100;
	
	public Customer() {
		System.out.println("Tai khoan cua ban la : " + balance);
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("Dang thuc hien giao dich rut tien : " + amount + " ...");
	
		while(balance < amount) {
			System.out.println("Khong du tien rut!");
			
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		balance -= amount;
		System.out.println("Rut tien thanh cong, tai khoan cua ban hien tai la " + balance);
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Dang thuc hien giao dich nap tien " + amount + " ... ");
		balance += amount;
		System.out.println("Nap tien thanh cong. Tai khoan hien tai la " + balance);
		notify();
	}
}
