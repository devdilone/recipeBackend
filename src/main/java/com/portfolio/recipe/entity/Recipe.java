package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.portfolio.recipe.dto.RecipeDTO;

@Entity
public class Recipe {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer recipeid;
@Column(nullable = true)
private String name;
private String img;
private String recipeType;

public String getRecipeType() {
	return recipeType;
}
public void setRecipeType(String recipeType) {
	this.recipeType = recipeType;
}
public Recipe() {
	super();
}
// TODO this needs to be made into a special method that only gets used while the database is getting created
public Recipe(RecipeDTO dto) {
	super();
	this.recipeid = dto.getRecipeid();
	this.name = dto.getName();
//	img String must be spliced here to only save the actual image file for example -> 06db8d725ac25ed4a7fa4bebeaeee2bb.jpg
	this.img = dto.getImg();
//    img = originalFile.substring(originalFile.lastIndexOf("/")+1,originalFile.lastIndexOf("?"));
	this.img = dto.getImg().substring(dto.getImg().lastIndexOf("/")+1,dto.getImg().lastIndexOf("?"));
	this.recipeType = dto.getRecipeType();
}

public Recipe(Integer recipeid, String name, String img, String recipeType) {
	super();
	this.recipeid = recipeid;
	this.name = name;
	this.img = img;
	this.recipeType = recipeType;
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
	return "Recipe [recipeid=" + recipeid + ", name=" + name + ", img=" + img + ", recipeType=" + recipeType + "]";
}



}