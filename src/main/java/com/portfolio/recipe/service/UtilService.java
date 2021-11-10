package com.portfolio.recipe.service;

import java.util.List;

import com.portfolio.recipe.dto.IngredientDTO;
import com.portfolio.recipe.dto.IngredientLikeDTO;
import com.portfolio.recipe.dto.RecipeDTO;
import com.portfolio.recipe.dto.RecipeIngredientDTO;
import com.portfolio.recipe.dto.RecipeTagDTO;
import com.portfolio.recipe.dto.SavedRecipeDTO;
import com.portfolio.recipe.dto.TagDTO;
import com.portfolio.recipe.dto.TagLikeDTO;
import com.portfolio.recipe.dto.UserDTO;

public interface UtilService {
	public String downloadDatabase();
	public void saveRecipes(List<RecipeDTO> dtoList);
	public void saveIngredients(List<IngredientDTO> dtoList);
	public void saveIngredientLikes(List<IngredientLikeDTO> dtoList);
	public void saveRecipeIngredients(List<RecipeIngredientDTO> dtoList);
	public void saveRecipeTags(List<RecipeTagDTO> dtoList);
	public void saveTags(List<TagDTO> dtoList);
	public void saveTagLikes(List<TagLikeDTO> dtoList);
	public void saveUsers(List<UserDTO> dtoList);
	public void saveSavedRecipes(List<SavedRecipeDTO> dtoList);
	
}
