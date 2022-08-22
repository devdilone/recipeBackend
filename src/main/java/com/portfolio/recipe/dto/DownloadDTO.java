package com.portfolio.recipe.dto;

import java.util.ArrayList;

public class DownloadDTO {
	private RecipeDTO downloadDTORecipe;
	private ArrayList<IngredientDTO> downloadDTOIngredientList;
	private ArrayList<TagDTO> downloadDTOTagList;
	
	public RecipeDTO getDownloadDTORecipe() {
		return downloadDTORecipe;
	}
	public void setDownloadDTORecipe(RecipeDTO downloadDTORecipe) {
		this.downloadDTORecipe = downloadDTORecipe;
	}
	public ArrayList<IngredientDTO> getDownloadDTOIngredientList() {
		return downloadDTOIngredientList;
	}
	public void setDownloadDTOIngredientList(ArrayList<IngredientDTO> downloadDTOIngredientList) {
		this.downloadDTOIngredientList = downloadDTOIngredientList;
	}
	public ArrayList<TagDTO> getDownloadDTOTagList() {
		return downloadDTOTagList;
	}
	public void setDownloadDTOTagList(ArrayList<TagDTO> downloadDTOTagList) {
		this.downloadDTOTagList = downloadDTOTagList;
	}
	@Override
	public String toString() {
		return "DownloadDTO [downloadDTORecipe=" + downloadDTORecipe + ", downloadDTOIngredientList="
				+ downloadDTOIngredientList + ", downloadDTOTagList=" + downloadDTOTagList + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((downloadDTOIngredientList == null) ? 0 : downloadDTOIngredientList.hashCode());
		result = prime * result + ((downloadDTORecipe == null) ? 0 : downloadDTORecipe.hashCode());
		result = prime * result + ((downloadDTOTagList == null) ? 0 : downloadDTOTagList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DownloadDTO other = (DownloadDTO) obj;
		if (downloadDTOIngredientList == null) {
			if (other.downloadDTOIngredientList != null)
				return false;
		} else if (!downloadDTOIngredientList.equals(other.downloadDTOIngredientList))
			return false;
		if (downloadDTORecipe == null) {
			if (other.downloadDTORecipe != null)
				return false;
		} else if (!downloadDTORecipe.equals(other.downloadDTORecipe))
			return false;
		if (downloadDTOTagList == null) {
			if (other.downloadDTOTagList != null)
				return false;
		} else if (!downloadDTOTagList.equals(other.downloadDTOTagList))
			return false;
		return true;
	}

	
}


