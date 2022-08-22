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
import com.portfolio.recipe.service.UtilService; 
@RestController
@CrossOrigin
@RequestMapping("/backup")
public class BackupController {
	private Logger log = LogManager.getLogger(BackupController.class);  
//	TODO prepare these methods to include exception handling as well as a generic OK status
//	TODO remove splunk dependancies
	@Autowired
	UtilService utilService;


	@PostMapping("/downloadDatabase")
	public ResponseEntity<ArrayList<DownloadDTO>> backup(@RequestBody ArrayList<DownloadDTO> downloadDTOs)  {
		System.out.println("dto list: \n" + downloadDTOs);
		utilService.downloadDatabase(downloadDTOs);
        return new ResponseEntity<ArrayList<DownloadDTO>>(downloadDTOs,HttpStatus.OK);
	}
	
	@PostMapping("/recipe")
	public ResponseEntity<String> postRecipe(@RequestBody List<RecipeDTO> dtoList) {
		utilService.saveRecipes(dtoList);
		return new ResponseEntity<String>("Recipes Saved" ,HttpStatus.CREATED);
	}
	@GetMapping("/recipe")
	public ResponseEntity<List<RecipeDTO>> getRecipe(@RequestBody RecipeDTO dto) {
//		TODO impl needed
		List<RecipeDTO> list = utilService.fetchAllRecipes();
		for(RecipeDTO recipe : list) {
			System.out.println(recipe);
		}
		return null;
	}
	@PostMapping("/ingredient")
	public ResponseEntity<String> ingredient(@RequestBody List<IngredientDTO> dtoList){
		utilService.saveIngredients(dtoList);
		return new ResponseEntity<String>("Ingredients Saved" ,HttpStatus.CREATED);
	}
	@PostMapping("/ingredientLike")
	public ResponseEntity<String> ingredientLike(@RequestBody List<IngredientLikeDTO> dtoList){
		utilService.saveIngredientLikes(dtoList);
		return new ResponseEntity<String>("IngredientLikes Saved" ,HttpStatus.CREATED);
	}
	@PostMapping("/recipeIngredient")
	public ResponseEntity<String> recipeIngredient(@RequestBody List<RecipeIngredientDTO> dtoList){
		utilService.saveRecipeIngredients(dtoList);
		return new ResponseEntity<String>("Recipe Ingredients Saved" ,HttpStatus.CREATED);
	}
	@PostMapping("/recipeTag")
	public ResponseEntity<String> recipeTag(@RequestBody List<RecipeTagDTO> dtoList){
		utilService.saveRecipeTags(dtoList);
		return new ResponseEntity<String>("Tags Saved" ,HttpStatus.CREATED);
	}
	@PostMapping("/savedRecipe")
	public ResponseEntity<String> savedRecipe(@RequestBody List<SavedRecipeDTO> dtoList){
		utilService.saveSavedRecipes(dtoList);
		return new ResponseEntity<String>("SavedRecipes Saved" ,HttpStatus.CREATED);
	}
	@PostMapping("/tag")
	public ResponseEntity<String> tag(@RequestBody List<TagDTO> dtoList){
		utilService.saveTags(dtoList);
		return new ResponseEntity<String>("Tags Saved" ,HttpStatus.CREATED);
	}
	@PostMapping("/tagLike")
	public ResponseEntity<String> tagLike(@RequestBody List<TagLikeDTO> dtoList){
		utilService.saveTagLikes(dtoList);
		return new ResponseEntity<String>("TagLikes Saved" ,HttpStatus.CREATED);
	}
	@PostMapping("/user")
	public ResponseEntity<String> user(@RequestBody List<UserDTO> dtoList){
		utilService.saveUsers(dtoList);
		return new ResponseEntity<String>("Users Saved" ,HttpStatus.CREATED);
	}
	
}
