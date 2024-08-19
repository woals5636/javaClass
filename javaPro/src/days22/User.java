package days22;

import java.io.Serializable;

public class User implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1871630127659443266L;
	
	String name;
	// 객체를 직렬화할 때 password는 포함 X
	transient String password;
	int age;
	
	public User() {
		this("Unknown","1234",0);
		
	}

	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}



}
