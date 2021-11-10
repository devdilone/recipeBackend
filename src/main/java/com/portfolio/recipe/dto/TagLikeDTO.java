package com.portfolio.recipe.dto;

import com.portfolio.recipe.entity.TagLike;

public class TagLikeDTO {
	private Integer tagLikeId;
	private Integer tagId;
	private Integer userId;
	private String likeType;
	
	
	public TagLikeDTO() {
		super();
	}
	public TagLikeDTO(TagLike entity) {
		super();
		this.tagLikeId = entity.getTagLikeId();
		this.tagId = entity.getTagId();
		this.userId = entity.getUserId();
		this.likeType = entity.getLikeType();
	}
	public TagLikeDTO(Integer tagLikeId, Integer tagId, Integer userId, String likeType) {
		super();
		this.tagLikeId = tagLikeId;
		this.tagId = tagId;
		this.userId = userId;
		this.likeType = likeType;
	}
	public Integer getTagLikeId() {
		return tagLikeId;
	}
	public void setTagLikeId(Integer tagLikeId) {
		this.tagLikeId = tagLikeId;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLikeType() {
		return likeType;
	}
	public void setLikeType(String likeType) {
		this.likeType = likeType;
	}
	
	public TagLike toEntity(TagLikeDTO dto) {
		return new TagLike(dto);
	}
	
}
