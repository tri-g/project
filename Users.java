package com.example.minilogin.model;

public class Users {
	private Long id;
	private  boolean active;
	private String address;
	private String email;
	private String name;
	private String password;
	private String phone;
	private String role;
	public Users()
	{
		
	}
	public Users(Long id, boolean active, String address, String email, String name, String password, String phone,
			String role) {
		this.id = id;
		this.active = active;
		this.address = address;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.role = role;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", active=" + active + ", address=" + address + ", email=" + email + ", name=" + name
				+ ", password=" + password + ", phone=" + phone + ", role=" + role + "]";
	}
	
	

}