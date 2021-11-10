package com.portfolio.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.recipe.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
