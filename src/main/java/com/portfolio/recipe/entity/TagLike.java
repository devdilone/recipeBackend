package com.portfolio.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.portfolio.recipe.dto.TagLikeDTO;

@Entity
@Table(name="tag_likes")
public class TagLike {
@Override
	public String toString() {
		return "TagLike [tagLikeId=" + tagLikeId + ", tagId=" + tagId + ", userId=" + userId + ", likeType=" + likeType
				+ "]";
	}

@Id
@Column(name="tag_likeid")
private Integer tagLikeId;
@Column(name="tagid")
private Integer tagId;
@Column(name="userid")
private Integer userId;
@Column(name="liketype")
private String likeType;
public TagLike(TagLikeDTO dto) {
	this.tagLikeId = dto.getTagLikeId();
	this.tagId = dto.getTagId();
	this.userId = dto.getUserId();
	this.likeType = dto.getLikeType();
}

public TagLike() {
	super();
}

public TagLike(Integer tagLikeId, Integer tagId, Integer userId, String likeType) {
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

public TagLikeDTO toDTO(TagLike entity) {
	return new TagLikeDTO(entity);
}

}
