package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SavedRecipe {
@Id
private Integer savedRecipesId;
private Integer recipeId;
private Integer userId;
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


}
