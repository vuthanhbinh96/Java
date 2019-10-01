package facade;

public class Client {

	public static void main(String[] args) {
		ShopFacade.getInstance().buyProductByCashWithFreeShipping("BinhDev@gmail.com");
		ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("BinhDev@gmail.com", "098888888");
	}
}
