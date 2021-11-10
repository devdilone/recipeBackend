package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.portfolio.recipe.dto.TagDTO;

@Entity
public class Tag {
@Override
	public String toString() {
		return "Tag [tagId=" + tagId + ", name=" + name + ", type=" + type + "]";
	}

@Id
@Column(name = "tagid")
private Integer tagId;
private String name;
private String type;
public Tag(TagDTO dto) {
	this.tagId = dto.getTagId();
	this.name = dto.getName();
	this.type = dto.getType();
}

public Tag(Integer tagId, String name, String type) {
	super();
	this.tagId = tagId;
	this.name = name;
	this.type = type;
}


public Tag() {
	super();
}

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

public TagDTO toDTO(Tag entity) {
	return new TagDTO(entity);
}


}
