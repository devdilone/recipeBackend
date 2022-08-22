package com.portfolio.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.recipe.entity.TagLike;

@Repository
public interface TagLikeRepo extends JpaRepository<TagLike, Integer>{

}
