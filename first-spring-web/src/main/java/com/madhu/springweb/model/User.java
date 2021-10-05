package com.madhu.springweb.model;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class User {

	@NotEmpty(message="FullName is required.")
	private String fullName;
	
	@NotEmpty(message="UserName is required.")
	@Email(message="Invalid Email.")
	private String userName;
	
	@Size(min = 6, message = "Password should be min of 6 characters.")
	private String password;
	
	@NotEmpty(message="PhoneNumber is required.")
	@Pattern(regexp="(^$|[0-9]{10})", message="Invalid PhoneNumber.")
	private String phoneNumber;
	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	

}
