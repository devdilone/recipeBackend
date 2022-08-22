package com.portfolio.recipe.service;

import java.util.ArrayList;
import java.util.List;

import com.portfolio.recipe.dto.RecipeDTO;

public interface RecipeService {
	public void saveRecipes(List<RecipeDTO> dtoList);
	public RecipeDTO fetchRecipe(RecipeDTO dto);
	public List<RecipeDTO> fetchAllRecipes();
	public RecipeDTO fetchRecipeWithRecipeId(Integer id);
	public List<RecipeDTO> fetchRecipesWithRecipeId(ArrayList<Integer> ids);
}
