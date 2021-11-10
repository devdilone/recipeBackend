package com.portfolio.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.recipe.entity.Tag;

@Repository
public interface TagRepo extends JpaRepository<Tag, Integer>{

}
