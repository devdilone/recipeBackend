package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecipeIngredient {
@Id
private Integer recipe_ingredientsId;
private Integer recipeId;
private Integer ingredientId;
public Integer getRecipe_ingredientsId() {
	return recipe_ingredientsId;
}
public void setRecipe_ingredientsId(Integer recipe_ingredientsId) {
	this.recipe_ingredientsId = recipe_ingredientsId;
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


}
