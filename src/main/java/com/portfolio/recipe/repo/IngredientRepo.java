package com.portfolio.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.recipe.entity.Ingredient;

@Repository
public interface IngredientRepo extends JpaRepository<Ingredient, Integer>{

}
