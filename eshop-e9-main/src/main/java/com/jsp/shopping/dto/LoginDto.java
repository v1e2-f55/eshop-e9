package com.jsp.shopping.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class LoginDto {

	@NotEmpty(message = "Email is Required")
	@Email(message = "Enter Proper Email")
	private String email;

	@NotEmpty(message = "Password is Required")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}