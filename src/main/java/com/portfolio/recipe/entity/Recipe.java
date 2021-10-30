package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
@Id
private Integer recipeid;
private String name;
private String img;




public Integer getRecipeid() {
	return recipeid;
}




public void setRecipeid(Integer recipeid) {
	this.recipeid = recipeid;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getImg() {
	return img;
}




public void setImg(String img) {
	this.img = img;
}




@Override
public String toString() {
	return "Recipe [recipeid=" + recipeid + ", name=" + name + ", img=" + img + "]";
}
}