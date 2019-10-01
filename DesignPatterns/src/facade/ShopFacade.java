package facade;

public class ShopFacade {
	
	private static final ShopFacade INSTANCE = new ShopFacade();
	
	private AccountService  accountService;
	private EmailService emailService;
	private PaymentService paymentService;
	private SmsService smsService;
	private ShippingService shippingService;
	
	private ShopFacade() {
		accountService = new AccountService();
		emailService = new EmailService();
		paymentService = new PaymentService();
		smsService = new SmsService();
		shippingService = new ShippingService();
	}
	
	public static ShopFacade getInstance() {
		return INSTANCE;
	}
	
	public void buyProductByCashWithFreeShipping(String email) {
		accountService.getAccount(email);
		paymentService.paymentByCash();
		shippingService.freeShipping();
		emailService.sendMail(email);
		System.out.println("Done!");
	}
	
	public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {
		accountService.getAccount(email);
		paymentService.paymentByPaypal();
		shippingService.standardShipping();
		emailService.sendMail(email);
		smsService.sendSMS(mobilePhone);
		System.out.println("Done");
	}

}
