package Observer;

public class Client {

	public static void main(String[] args) {
		AccountService accountService = createAccount("BinhDev@gmail.com", "127.0.0.1");
		accountService.login();
		accountService.changeStatus(LoginStatus.EXPIRED);
		
		System.out.println("----");
		AccountService accountService2 = createAccount("BinhDev@gmail.com", "0.0.0.0");
		accountService2.login();
		
	}
	
	private static AccountService createAccount(String email, String ip) {
		AccountService accountService = new AccountService(email, ip);
		accountService.attach(new Logger());
		accountService.attach(new Mailer());
		accountService.attach(new Protector());
		return accountService;
	}
}
