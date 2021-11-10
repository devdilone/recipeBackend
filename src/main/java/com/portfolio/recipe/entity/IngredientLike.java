package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.portfolio.recipe.dto.IngredientLikeDTO;

@Entity
@Table(name = "ingredient_likes")
public class IngredientLike {

@Override
	public String toString() {
		return "IngredientLike [ingredientLikesId=" + ingredientLikesId + ", userId=" + userId + ", likeType="
				+ likeType + ", ingredientId=" + ingredientId + "]";
	}

@Id
@Column(name = "ingredient_likesid")
private Integer ingredientLikesId;
@Column(name="userid")
private Integer userId;
@Column(name = "liketype")
private String likeType;
@Column(name = "ingredientid")
private Integer ingredientId;

public IngredientLike() {
	super();
}
public IngredientLike(Integer ingredientLikesId, Integer userId, String likeType, Integer ingredientId) {
	super();
	this.ingredientLikesId = ingredientLikesId;
	this.userId = userId;
	this.likeType = likeType;
	this.ingredientId = ingredientId;
}
public IngredientLike(IngredientLikeDTO dto) {
	this.ingredientLikesId = dto.getIngredientLikesId();
	this.userId = dto.getUserId();
	this.likeType = dto.getLikeType();
	this.ingredientId = dto.getIngredientId();
}
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

public IngredientLikeDTO toDTO(IngredientLike entity) {
	return new IngredientLikeDTO(entity);
}


}
