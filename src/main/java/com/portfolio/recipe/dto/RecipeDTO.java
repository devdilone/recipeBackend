package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.Recipe;

public class RecipeDTO {
	private Integer recipeid;
	private String name;
	private String img;
	private String recipeType;

	public String getRecipeType() {
		return recipeType;
	}
	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}
	
	public RecipeDTO(Recipe entity) {
		this.recipeid = entity.getRecipeid();
		this.name = entity.getName();
		this.img = entity.getImg();
		this.recipeType = entity.getRecipeType();
	}
	
	public RecipeDTO() {
		super();
	}


	public RecipeDTO(Integer recipeid, String name, String img, String recipeType) {
		super();
		this.recipeid = recipeid;
		this.name = name;
		this.img = img;
		this.recipeType = recipeType;
	}
	public Integer getRecipeid() {
		return recipeid;
	}
	public void setRecipeid(Integer recipeid) {
		this.recipeid = recipeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public static Recipe toEntity(RecipeDTO dto) {
		return new Recipe(dto);
	}
	@Override
	public String toString() {
		return "RecipeDTO [recipeid=" + recipeid + ", name=" + name + ", img=" + img + ", recipeType=" + recipeType
				+ "]";
	}
	
	
	
}
