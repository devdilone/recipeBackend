package com.portfolio.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.recipe.entity.RecipeTag;

@Repository
public interface RecipeTagRepo extends JpaRepository<RecipeTag, Integer>{

}
