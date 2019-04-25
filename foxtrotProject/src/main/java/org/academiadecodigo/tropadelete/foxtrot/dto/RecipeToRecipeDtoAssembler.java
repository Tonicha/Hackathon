package org.academiadecodigo.tropadelete.foxtrot.dto;

import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.academiadecodigo.tropadelete.foxtrot.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RecipeToRecipeDtoAssembler {

    private RecipeService recipeService;

    @Autowired
    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public RecipeDto convert(Recipe recipe){

        RecipeDto recipeDto = new RecipeDto();
        List<String> ingredients = recipe.getIngredients();

        recipeDto.setId(recipe.getId());
        recipeDto.setName(recipe.getName());
        recipeDto.setDescription(recipe.getDescription());

        recipeDto.setFirstIngredient(ingredients.get(0));
        recipeDto.setFirstIngredient(ingredients.get(1));
        recipeDto.setFirstIngredient(ingredients.get(2));
        recipeDto.setFirstIngredient(ingredients.get(3));
        recipeDto.setFirstIngredient(ingredients.get(4));

        return recipeDto;
    }
}
