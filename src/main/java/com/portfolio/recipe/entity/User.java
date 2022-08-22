package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.portfolio.recipe.dto.UserDTO;

@Entity
public class User {
@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", uName="
				+ uName + ", password=" + password + "]";
	}

@Id
@Column(name="userid")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer userId;
@Column(name="fname")
private String fName;
@Column(name="lname")
private String lName;
private String email;
@Column(name="uname")
private String uName;
private String password;

public User() {
	super();
}
public User(UserDTO dto) {
	super();
	this.userId = dto.getUserId();
	this.fName = dto.getfName();
	this.lName = dto.getlName();
	this.uName = dto.getuName();
	this.email = dto.getEmail();
	this.password = dto.getPassword();
}
public User(Integer userId, String fName, String lName, String email, String uName, String password) {
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

public UserDTO toDTO(User entity) {
	return new UserDTO(entity);
}


}
