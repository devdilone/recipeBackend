package com.portfolio.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.recipe.entity.IngredientLike;

@Repository
public interface IngredientLikeRepo extends JpaRepository<IngredientLike, Integer>{

}
