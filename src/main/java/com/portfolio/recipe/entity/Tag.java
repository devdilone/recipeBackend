package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tag {
@Id
private Integer tagId;
private String name;
private String type;
public Integer getTagId() {
	return tagId;
}
public void setTagId(Integer tagId) {
	this.tagId = tagId;
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
