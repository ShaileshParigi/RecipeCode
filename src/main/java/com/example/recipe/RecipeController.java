/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.recipe;

import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class RecipeController{
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipies(){
        return recipeService.getRecipies();
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId){
        return recipeService.getRecipeById(recipeId);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    }

    @PutMapping("recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId,@RequestBody Recipe recipe){
        return recipeService.updateRecipe(recipeId,recipe);
    }

    @DeleteMapping("recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId){
        recipeService.deleteRecipe(recipeId);
    }
    
}