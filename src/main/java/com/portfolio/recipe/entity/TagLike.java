package com.portfolio.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TagLike {
@Id
private Integer tagLikeId;
private Integer tagId;
private Integer userId;
private String likeType;
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



}
