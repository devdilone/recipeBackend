package com.portfolio.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.recipe.entity.RecipeIngredient;

@Repository
public interface RecipeIngredientRepo extends JpaRepository<RecipeIngredient, Integer>{

}
