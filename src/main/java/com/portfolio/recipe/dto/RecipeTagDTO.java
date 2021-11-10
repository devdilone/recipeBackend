package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.RecipeTag;

public class RecipeTagDTO {
	private Integer recipeTagId;
	private Integer tagId;
	private Integer recipeId;
	
	
	public RecipeTagDTO() {
		super();
	}
	public RecipeTagDTO(RecipeTag entity) {
		super();
		this.recipeTagId = entity.getRecipeTagid();
		this.tagId = entity.getTagId();
		this.recipeId = entity.getTagId();
		
	}
	public RecipeTagDTO(Integer recipeTagId, Integer tagId, Integer recipeId) {
		super();
		this.recipeTagId = recipeTagId;
		this.tagId = tagId;
		this.recipeId = recipeId;
	}
	public Integer getRecipeTagId() {
		return recipeTagId;
	}
	public void setRecipeTagId(Integer recipeTagId) {
		this.recipeTagId = recipeTagId;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public Integer getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}
	
	public RecipeTag toEntity(RecipeTagDTO dto) {
		return new RecipeTag(dto);
	}
}
