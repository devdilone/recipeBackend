package com.portfolio.recipe.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.recipe.dto.RecipeDTO;
import com.portfolio.recipe.entity.Recipe;
import com.portfolio.recipe.repo.IngredientLikeRepo;
import com.portfolio.recipe.repo.IngredientRepo;
import com.portfolio.recipe.repo.RecipeIngredientRepo;
import com.portfolio.recipe.repo.RecipeRepo;
import com.portfolio.recipe.repo.RecipeTagRepo;
import com.portfolio.recipe.repo.SavedRecipeRepo;
import com.portfolio.recipe.repo.TagLikeRepo;
import com.portfolio.recipe.repo.TagRepo;
import com.portfolio.recipe.repo.UserRepo;

@Service
public class RecipeServiceImpl implements RecipeService{

	@Autowired
	RecipeRepo recipeRepo;
	@Autowired
	IngredientLikeRepo ingrlikeRepo;
	@Autowired
	IngredientRepo ingredientRepo;
	@Autowired
	RecipeIngredientRepo recIngrRepo;
	@Autowired
	RecipeTagRepo recipeTagRepo;
	@Autowired
	SavedRecipeRepo savedRecipeRepo;
	@Autowired
	TagLikeRepo tagLikeRepo;
	@Autowired
	TagRepo tagRepo;
	@Autowired
	UserRepo userRepo;
	
	@Override
	public void saveRecipes(List<RecipeDTO> dtoList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RecipeDTO fetchRecipe(RecipeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecipeDTO> fetchAllRecipes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecipeDTO fetchRecipeWithRecipeId(Integer id) {
		Recipe recipe = recipeRepo.getById(id);	
		return recipe.toDTO(recipe);
	}

	@Override
	public List<RecipeDTO> fetchRecipesWithRecipeId(ArrayList<Integer> ids) {
//		Integer[] array = (Integer[]) ids.toArray();
//		Iterable<Integer> iterable = Arrays.asList(array);
		List<Recipe> recipeList = recipeRepo.findAllById(ids); 
		List<RecipeDTO> dtoList = new ArrayList<RecipeDTO>();
		
		for( Recipe recipe: recipeList) {
			RecipeDTO dtoToAdd = recipe.toDTO(recipe);
			dtoList.add(dtoToAdd);
		}
		return dtoList;
	}

}


























