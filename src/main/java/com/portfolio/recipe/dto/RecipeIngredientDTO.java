package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.RecipeIngredient;

public class RecipeIngredientDTO {
	private Integer recipeIngredientsId;
	private Integer recipeId;
	private Integer ingredientId;
	
	public RecipeIngredientDTO(RecipeIngredient entity) {
	super();
	this.recipeIngredientsId = entity.getRecipe_ingredientsId();
	this.recipeId = entity.getRecipeId();
	this.ingredientId = entity.getIngredientId();
	
	}public RecipeIngredientDTO() {
		super();
	}

	public RecipeIngredientDTO(Integer recipeIngredientsId, Integer recipeId, Integer ingredientId) {
		super();
		this.recipeIngredientsId = recipeIngredientsId;
		this.recipeId = recipeId;
		this.ingredientId = ingredientId;
	}
	public Integer getRecipeIngredientsId() {
		return recipeIngredientsId;
	}
	public void setRecipeIngredientsId(Integer recipeIngredientsId) {
		this.recipeIngredientsId = recipeIngredientsId;
	}
	public Integer getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}
	public Integer getIngredientId() {
		return ingredientId;
	}
	public void setIngredientId(Integer ingredientId) {
		this.ingredientId = ingredientId;
	}
	
	public RecipeIngredient toEntity(RecipeIngredientDTO dto) {
		return new RecipeIngredient(dto);
	}
	
}
