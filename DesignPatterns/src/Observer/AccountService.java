package Observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject{

	private User user;
	private List<Observer> observers = new ArrayList<>();
	
	public AccountService(String email, String ip) {
		user = new User();
		user.setEmail(email);
		user.setIp(ip);
	}
	
	@Override
	public void attach(Observer observer) {
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void detach(Observer observer) {
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update(user);
		}
	}
	
	public void changeStatus(LoginStatus loginStatus) {
		user.setStatus(loginStatus);
		System.out.println("Status is changed");
		this.notifyAllObserver();
	}
	
	public void login() {
		if(!this.isValidIp()) {
			user.setStatus(LoginStatus.INVALID);
		} else if(isValidEmail()) {
			user.setStatus(LoginStatus.SUCCESS);
		} else {
			user.setStatus(LoginStatus.FAILURE);
		}
		
		System.out.println("Login is handled");
		this.notifyAllObserver();
	}
	
	private boolean isValidIp() {
		return "127.0.0.1".equalsIgnoreCase(user.getIp());
	}
	
	private boolean isValidEmail() {
		return "BinhDev@gmail.com".equalsIgnoreCase(user.getEmail());
	}

}
