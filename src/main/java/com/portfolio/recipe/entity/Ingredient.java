package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredient {
	@Id
	private Integer ingredientid;
	private String name;
	private String type;

	
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

}
