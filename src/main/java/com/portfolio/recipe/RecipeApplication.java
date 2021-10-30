package com.portfolio.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.portfolio.recipe.repo.RecipeRepo;

@SpringBootApplication
public class RecipeApplication implements CommandLineRunner{

	@Autowired
	RecipeRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}

}
