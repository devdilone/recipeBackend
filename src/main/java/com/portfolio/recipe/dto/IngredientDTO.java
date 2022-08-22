package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.Ingredient;

public class IngredientDTO {
	private Integer ingredientid;
	private String name;
	private String type;
	
	public IngredientDTO(Ingredient entity) {
		super();
		this.ingredientid  = entity.getIngredientid();
		this.name = entity.getName();
		this.type = entity.getType();
	}
	public IngredientDTO() {
		super();
	}
	public IngredientDTO(Integer ingredientid, String name, String type) {
		super();
		this.ingredientid = ingredientid;
		this.name = name;
		this.type = type;
	}
	public Integer getIngredientid() {
		return ingredientid;
	}
	public void setIngredientid(Integer ingredientid) {
		this.ingredientid = ingredientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public static Ingredient toEntity(IngredientDTO dto) {
		return new Ingredient(dto);
	}
	
	
}
