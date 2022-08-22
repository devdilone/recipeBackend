package com.portfolio.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.apache.logging.log4j.LogManager;  
import org.apache.logging.log4j.Logger;  
import org.springframework.boot.CommandLineRunner;  
import org.springframework.stereotype.Service;

import com.portfolio.recipe.dto.RecipeDTO;
import com.portfolio.recipe.service.UtilService; 
@SpringBootApplication
public class RecipeApplication implements CommandLineRunner{
	@Autowired
	UtilService utilService;
	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
//		List<RecipeDTO> list = utilService.fetchAllRecipes();
//		for(RecipeDTO recipe : list) {
//			System.out.println(recipe);
//		}
        
	}
}
