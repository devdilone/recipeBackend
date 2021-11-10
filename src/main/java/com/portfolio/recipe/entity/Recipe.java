package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.portfolio.recipe.dto.RecipeDTO;

@Entity
public class Recipe {
@Id
private Integer recipeid;
private String name;
private String img;

public Recipe() {
	super();
}
public Recipe(RecipeDTO dto) {
	super();
	this.recipeid = dto.getRecipeid();
	this.name = dto.getName();
	this.img = dto.getImg();
}

public Recipe(Integer recipeid, String name, String img) {
	super();
	this.recipeid = recipeid;
	this.name = name;
	this.img = img;
}

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

public RecipeDTO toDTO(Recipe entity) {
	return new RecipeDTO(entity);
}


@Override
public String toString() {
	return "Recipe [recipeid=" + recipeid + ", name=" + name + ", img=" + img + "]";
}
}