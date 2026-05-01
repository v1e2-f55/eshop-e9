package com.jsp.shopping.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserDto {

	@NotEmpty(message = "Name is Required")
	private String name;

	@NotEmpty(message = "Email is Required")
	@Email(message = "Email should be in proper format")
	private String email;

	@NotEmpty(message = "Password is Required")
	private String password;

	@NotNull(message = "Mobile is Required")
	private Long mobile;

	public UserDto() {}

	public UserDto(String name, String email, String password, Long mobile) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	public Long getMobile() { return mobile; }
	public void setMobile(Long mobile) { this.mobile = mobile; }
}