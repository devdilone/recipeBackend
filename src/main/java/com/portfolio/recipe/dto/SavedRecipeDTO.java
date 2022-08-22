package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.SavedRecipe;

public class SavedRecipeDTO {
	private Integer savedRecipesId;
	private Integer recipeId;
	private Integer userId;
	
	
	public SavedRecipeDTO() {
		super();
	}
	public SavedRecipeDTO(SavedRecipe entity) {
		super();
		this.savedRecipesId = entity.getSavedRecipesId();
		this.recipeId = entity.getRecipeId();
		this.userId = entity.getUserId();
	}
	public SavedRecipeDTO(Integer savedRecipesId, Integer recipeId, Integer userId) {
		super();
		this.savedRecipesId = savedRecipesId;
		this.recipeId = recipeId;
		this.userId = userId;
	}
	public Integer getSavedRecipesId() {
		return savedRecipesId;
	}
	public void setSavedRecipesId(Integer savedRecipesId) {
		this.savedRecipesId = savedRecipesId;
	}
	public Integer getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public SavedRecipe toEntity(SavedRecipeDTO dto) {
		return new SavedRecipe(dto);
	}
	
}
