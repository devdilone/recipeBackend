package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.portfolio.recipe.dto.IngredientDTO;

@Entity
public class Ingredient {
	@Override
	public String toString() {
		return "Ingredient [ingredientid=" + ingredientid + ", name=" + name + ", type=" + type + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ingredientid;
	@Column(nullable = true)
	private String name;
	private String type;

	public Ingredient() {
		super();
	}
	public Ingredient(Integer ingredientid, String name, String type) {
		super();
		this.ingredientid = ingredientid;
		this.name = name;
		this.type = type;
	}
	public Ingredient(IngredientDTO dto) {
		this.ingredientid = dto.getIngredientid();
		this.name = dto.getName();
		this.type = dto.getType();
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
	public IngredientDTO toDto(Ingredient entity) {
		return new IngredientDTO(entity);
	}

}
