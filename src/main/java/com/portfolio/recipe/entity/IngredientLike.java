package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IngredientLike {

@Id
private Integer ingredientLikesId;
private Integer userId;
private String likeType;
private Integer ingredientId;

public Integer getIngredientLikesId() {
	return ingredientLikesId;
}
public void setIngredientLikesId(Integer ingredientLikesId) {
	this.ingredientLikesId = ingredientLikesId;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getLikeType() {
	return likeType;
}
public void setLikeType(String likeType) {
	this.likeType = likeType;
}
public Integer getIngredientId() {
	return ingredientId;
}
public void setIngredientId(Integer ingredientId) {
	this.ingredientId = ingredientId;
}


}
