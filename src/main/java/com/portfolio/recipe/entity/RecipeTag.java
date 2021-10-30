package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecipeTag {
@Id
private Integer recipe_tagid;
private Integer tagid;
private Integer recipeid;
public Integer getRecipe_tagid() {
	return recipe_tagid;
}
public void setRecipe_tagid(Integer recipe_tagid) {
	this.recipe_tagid = recipe_tagid;
}
public Integer getTagid() {
	return tagid;
}
public void setTagid(Integer tagid) {
	this.tagid = tagid;
}
public Integer getRecipeid() {
	return recipeid;
}
public void setRecipeid(Integer recipeid) {
	this.recipeid = recipeid;
}


}
