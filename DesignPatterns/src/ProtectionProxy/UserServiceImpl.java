package ProtectionProxy;

public class UserServiceImpl implements UserService{

	private String name;
	
	public UserServiceImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void load() {
		System.out.println(this.name + " loaded!");
	}

	@Override
	public void insert() {
		System.out.println(this.name + " inserted!");
	}

}
