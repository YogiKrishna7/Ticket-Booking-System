package com.ticketbooking.app;

public class User {
	
	private int userId;
	private String name;
    private String phno;
    private String email;
    private String address;
    private String userName;
    private String password;
    
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String modifiedDate;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String name, String phno, String email, String address, String userName, String password,
			String createdBy, String createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
	
	
	
	
	
	
	
	
}