package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.Recipe;

public class RecipeDTO {
	private Integer recipeid;
	private String name;
	private String img;
	
	public RecipeDTO(Recipe entity) {
		this.recipeid = entity.getRecipeid();
		this.name = entity.getName();
		this.img = entity.getImg();
	}
	
	public RecipeDTO() {
		super();
	}

	public RecipeDTO(Integer recipeid, String name, String img) {
		super();
		this.recipeid = recipeid;
		this.name = name;
		this.img = img;
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
	public Recipe toEntity(RecipeDTO dto) {
		return new Recipe(dto);
	}
	
}
