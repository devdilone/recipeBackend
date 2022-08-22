package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.IngredientLike;

public class IngredientLikeDTO {
	private Integer ingredientLikesId;
	private Integer userId;
	private String likeType;
	private Integer ingredientId;
	
	
	public IngredientLikeDTO() {
		super();
	}
	public IngredientLikeDTO(IngredientLike entity) {
		super();
		this.ingredientLikesId = entity.getIngredientLikesId();
		this.userId = entity.getUserId();
		this.likeType = entity.getLikeType();
		this.ingredientId = entity.getIngredientId();
	}
	public IngredientLikeDTO(Integer ingredientLikesId, Integer userId, String likeType, Integer ingredientId) {
		super();
		this.ingredientLikesId = ingredientLikesId;
		this.userId = userId;
		this.likeType = likeType;
		this.ingredientId = ingredientId;
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
	public IngredientLike toEntity(IngredientLikeDTO dto) {
		return new IngredientLike(dto);
	}
	
}
