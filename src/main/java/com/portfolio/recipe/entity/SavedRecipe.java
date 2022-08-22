package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.portfolio.recipe.dto.SavedRecipeDTO;

@Entity
@Table(name="saved_recipes")
public class SavedRecipe {
@Override
	public String toString() {
		return "SavedRecipe [savedRecipesId=" + savedRecipesId + ", recipeId=" + recipeId + ", userId=" + userId + "]";
	}

@Id
@Column(name="saved_recipesid")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer savedRecipesId;
@Column(name="recipeid")
private Integer recipeId;
@Column(name="userid")
private Integer userId;
public SavedRecipe(SavedRecipeDTO dto) {
	this.savedRecipesId = dto.getSavedRecipesId();
	this.recipeId = dto.getRecipeId();
	this.userId = dto.getUserId();
}

public SavedRecipe() {
	super();
}

public SavedRecipe(Integer savedRecipesId, Integer recipeId, Integer userId) {
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

public SavedRecipeDTO toDTO(SavedRecipe entity) {
	return new SavedRecipeDTO(entity);
}

}
