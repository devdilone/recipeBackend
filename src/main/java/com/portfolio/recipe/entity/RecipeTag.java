package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.portfolio.recipe.dto.RecipeTagDTO;

@Entity
@Table(name="recipe_tags")
public class RecipeTag {
@Override
	public String toString() {
		return "RecipeTag [recipeTagid=" + recipeTagid + ", tagId=" + tagId + ", recipeId=" + recipeId + "]";
	}

@Id
@Column(name="recipe_tagid")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer recipeTagid;
@Column(name="tagid")
private Integer tagId;
@Column(name="recipeid")
private Integer recipeId;
public RecipeTag(RecipeTagDTO dto) {
	this.recipeTagid = dto.getRecipeTagId();
	this.tagId = dto.getTagId();
	this.recipeId = dto.getRecipeId();
}

public RecipeTag() {
	super();
}

public RecipeTag(Integer recipeTagid, Integer tagId, Integer recipeId) {
	super();
	this.recipeTagid = recipeTagid;
	this.tagId = tagId;
	this.recipeId = recipeId;
}

public Integer getRecipeTagid() {
	return recipeTagid;
}
public void setRecipeTagid(Integer recipeTagid) {
	this.recipeTagid = recipeTagid;
}
public Integer getTagId() {
	return tagId;
}
public void setTagId(Integer tagId) {
	this.tagId = tagId;
}
public Integer getRecipeId() {
	return recipeId;
}
public void setRecipeId(Integer recipeId) {
	this.recipeId = recipeId;
}

public RecipeTagDTO toDTO(RecipeTag entity) {
	return new RecipeTagDTO(entity);
}

}
