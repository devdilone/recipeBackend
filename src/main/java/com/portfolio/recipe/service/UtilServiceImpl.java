package com.portfolio.recipe.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

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
import com.portfolio.recipe.entity.Ingredient;
import com.portfolio.recipe.entity.IngredientLike;
import com.portfolio.recipe.entity.Recipe;
import com.portfolio.recipe.entity.RecipeIngredient;
import com.portfolio.recipe.entity.RecipeTag;
import com.portfolio.recipe.entity.SavedRecipe;
import com.portfolio.recipe.entity.Tag;
import com.portfolio.recipe.entity.TagLike;
import com.portfolio.recipe.entity.User;
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
public class UtilServiceImpl implements UtilService{

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
	public String downloadDatabase(ArrayList<DownloadDTO> dtos) {
		for(DownloadDTO dto:dtos) {
//			check for null name value
			
//			save the recipe R
			System.out.println("saving recipe " + dto.getDownloadDTORecipe());
			Recipe savedRecipe = recipeRepo.save(RecipeDTO.toEntity(dto.getDownloadDTORecipe()));
			
//			save ingredients I belonging to R
			for(IngredientDTO ingrDto: dto.getDownloadDTOIngredientList()) {
				System.out.println("saving ingredient");
				Ingredient ingrEntity = IngredientDTO.toEntity(ingrDto);
//				Example<Ingredient> exIngr = Example.of(ingrEntity);
//				Optional<Ingredient> ingrOptional =ingredientRepo.findOne(exIngr);
				Ingredient savedIngredient;
//				if(ingrOptional.isEmpty()) {
					savedIngredient = ingredientRepo.save(ingrEntity);
//				}else {
//					savedIngredient = ingrOptional.get();
//				}
				
//				save the connections between I and R
				RecipeIngredientDTO recIngrDTO = new RecipeIngredientDTO(null,savedRecipe.getRecipeid(),savedIngredient.getIngredientid());
				recIngrRepo.save(RecipeIngredientDTO.toEntity(recIngrDTO));
			}
			
//			save all tags T, making sure your not saving tags that already exist
			for(TagDTO tagDTO : dto.getDownloadDTOTagList()) {
				System.out.println("saving tag");
				Tag tagEntity = TagDTO.toEntity(tagDTO);
//				Example<Tag> exTag = Example.of(tagEntity);
//				Optional<Tag> tagOptional = tagRepo.findOne(exTag);
				
				Tag savedTag;
//				if(tagOptional.isEmpty()) {
					savedTag = tagRepo.save(tagEntity);
//				}else {
//					savedTag = tagOptional.get();
//				}

//				save the connections between T and R
				RecipeTagDTO recTagDTO = new RecipeTagDTO(null, savedTag.getTagId(), savedRecipe.getRecipeid());
				recipeTagRepo.save(RecipeTagDTO.toEntity(recTagDTO));
			}
			

		}
		
		return "downloaded DTOs";
	}


	@Override
	public void saveRecipes(List<RecipeDTO> dtoList) {
		List<Recipe> entities =new ArrayList<Recipe>();
		for(RecipeDTO dto:dtoList) {
			Recipe entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		recipeRepo.saveAll(entities);
	}


	@Override
	public void saveIngredients(List<IngredientDTO> dtoList) {
		List<Ingredient> entities =new ArrayList<>();
		for(IngredientDTO dto:dtoList) {
			 Ingredient entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		ingredientRepo.saveAll(entities);
	}


	@Override
	public void saveIngredientLikes(List<IngredientLikeDTO> dtoList) {
		List<IngredientLike> entities =new ArrayList<>();
		for(IngredientLikeDTO dto:dtoList) {
			 IngredientLike entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		ingrlikeRepo.saveAll(entities);		
	}


	@Override
	public void saveRecipeIngredients(List<RecipeIngredientDTO> dtoList) {
		List<RecipeIngredient> entities =new ArrayList<>();
		for(RecipeIngredientDTO dto:dtoList) {
			RecipeIngredient entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		recIngrRepo.saveAll(entities);		
	}


	@Override
	public void saveRecipeTags(List<RecipeTagDTO> dtoList) {
		List<RecipeTag> entities =new ArrayList<>();
		for(RecipeTagDTO dto:dtoList) {
			 RecipeTag entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		recipeTagRepo.saveAll(entities);		
	}


	@Override
	public void saveTags(List<TagDTO> dtoList) {
		List<Tag> entities =new ArrayList<>();
		for(TagDTO dto:dtoList) {
			 Tag entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		tagRepo.saveAll(entities);		
	}


	@Override
	public void saveTagLikes(List<TagLikeDTO> dtoList) {
		List<TagLike> entities =new ArrayList<>();
		for(TagLikeDTO dto:dtoList) {
			 TagLike entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		tagLikeRepo.saveAll(entities);
	}


	@Override
	public void saveUsers(List<UserDTO> dtoList) {
		List<User> entities =new ArrayList<>();
		for(UserDTO dto:dtoList) {
			 User entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		userRepo.saveAll(entities);		
	}


	@Override
	public void saveSavedRecipes(List<SavedRecipeDTO> dtoList) {
		List<SavedRecipe> entities =new ArrayList<>();
		for(SavedRecipeDTO dto:dtoList) {
			 SavedRecipe entityToAdd = dto.toEntity(dto);
			entities.add(entityToAdd);
		}
		savedRecipeRepo.saveAll(entities);
	}


	@Override
	public RecipeDTO fetchRecipe(RecipeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<RecipeDTO> fetchAllRecipes() {
		List<Recipe> recipeList = recipeRepo.findAll();
		List<RecipeDTO> dtoList = new ArrayList<RecipeDTO>();
		for(Recipe recipe : recipeList) {
			RecipeDTO dtoToAdd = recipe.toDTO(recipe);
			dtoList.add(dtoToAdd);
		}
		return dtoList;
	}
}
