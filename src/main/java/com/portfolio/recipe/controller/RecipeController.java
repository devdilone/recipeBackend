package com.portfolio.recipe.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.portfolio.recipe.dto.DownloadDTO;
import com.portfolio.recipe.dto.IngredientDTO;
import com.portfolio.recipe.dto.IngredientLikeDTO;
import com.portfolio.recipe.dto.RecipeDTO;
import com.portfolio.recipe.dto.RecipeIngredientDTO;
import com.portfolio.recipe.dto.RecipeTagDTO;
import com.portfolio.recipe.dto.SavedRecipeDTO;
import com.portfolio.recipe.dto.TagDTO;
import com.portfolio.recipe.dto.TagLikeDTO;
import com.portfolio.recipe.dto.UserDTO;
import com.portfolio.recipe.service.RecipeService;
import com.portfolio.recipe.service.UtilService; 
@RestController
@CrossOrigin
@RequestMapping("/")
public class RecipeController {

	private Logger log = LogManager.getLogger(RecipeController.class);  
	
	@Autowired
	UtilService utilService;
	@Autowired
	RecipeService recipeService;
	
	@GetMapping("/recipe")
	public ResponseEntity<List<RecipeDTO>> getRecipe(@RequestBody ArrayList<Integer> recipes) {
//		List<RecipeDTO> list = utilService.fetchAllRecipes();
//		for(RecipeDTO recipe : list) {
//			System.out.println(recipe);
//		}
		
		System.out.println(recipes);
		for(Integer num:recipes) {
			System.out.println(num);
		}
//		return new ResponseEntity<String>("Ingredients Saved" ,HttpStatus.CREATED);
		return new ResponseEntity<List<RecipeDTO>>(recipeService.fetchRecipesWithRecipeId(recipes),HttpStatus.OK);
//		return null;
	}
}