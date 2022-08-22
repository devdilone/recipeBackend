package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.portfolio.recipe.dto.RecipeIngredientDTO;

@Entity
@Table(name="recipe_ingredients")
public class RecipeIngredient {
	@Override
	public String toString() {
		return "RecipeIngredient [recipeIngredientsId=" + recipeIngredientsId + ", recipeId=" + recipeId
				+ ", ingredientId=" + ingredientId + "]";
	}
	@Id
	@Column(name="recipe_ingredientsid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer recipeIngredientsId;
	@Column(name="recipeid")
	private Integer recipeId;
	@Column(name="ingredientid")
	private Integer ingredientId;

	public RecipeIngredient() {
		super();
	}
	public RecipeIngredient(RecipeIngredientDTO dto) {
		super();
		this.recipeIngredientsId = dto.getIngredientId();
		this.recipeId = dto.getRecipeId();
		this.ingredientId = dto.getIngredientId();
	}
	
	public RecipeIngredient(Integer recipeIngredientsId, Integer recipeId, Integer ingredientId) {
		super();
		this.recipeIngredientsId = recipeIngredientsId;
		this.recipeId = recipeId;
		this.ingredientId = ingredientId;
	}
	public Integer getRecipe_ingredientsId() {
		return recipeIngredientsId;
	}
	public void setRecipe_ingredientsId(Integer recipe_ingredientsId) {
		this.recipeIngredientsId = recipe_ingredientsId;
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
	public RecipeIngredientDTO toDto(RecipeIngredient entity) {
		return new RecipeIngredientDTO(entity);
	}

}
