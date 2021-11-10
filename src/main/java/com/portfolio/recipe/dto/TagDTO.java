package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.Tag;

public class TagDTO {
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
	public TagDTO(Integer tagId, String name, String type) {
		super();
		this.tagId = tagId;
		this.name = name;
		this.type = type;
	}
	public TagDTO() {
		super();
	}
	public TagDTO(Tag entity) {
		super();
		this.tagId = entity.getTagId();
		this.name = entity.getName();
		this.type = entity.getType();
	}
	public Tag toEntity(TagDTO dto) {
		return new Tag(dto);
	}
	
}
