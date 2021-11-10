package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.User;

public class UserDTO {
	private Integer userId;
	private String fName;
	private String lName;
	private String email;
	private String uName;
	private String password;
	
	public UserDTO(User entity) {
		this.userId = entity.getUserId();
		this.fName = entity.getfName();
		this.lName = entity.getlName();
		this.email = entity.getEmail();
		this.uName = entity.getuName();
		this.password = entity.getPassword();
	}
	
	
	public UserDTO() {
		super();
	}


	public UserDTO(Integer userId, String fName, String lName, String email, String uName, String password) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.uName = uName;
		this.password = password;
	}


	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User toEntity(UserDTO dto) {
		return new User(dto);
	}
	
}
