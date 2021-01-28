package com.codechobo;

public class User {
	// 값을 저장하는 필드
	private String id;
	private String name;
	private String password;
	private String email;
	
	public User() {
	}

	public User(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	// get  필드의 값을 읽어오는 값
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	// set  필드의 값을 변경하는 값
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
