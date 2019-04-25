package org.academiadecodigo.tropadelete.foxtrot.dto;

import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.academiadecodigo.tropadelete.foxtrot.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeToRecipeDtoAssembler {

    private RecipeService recipeService;

    @Autowired
    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public RecipeDto convert(Recipe recipe){

        RecipeDto recipeDto = new RecipeDto();

        recipeDto.setId(recipe.getId());
        recipeDto.setName(recipe.getName());
        recipeDto.setDescription(recipe.getDescription());

        recipeDto.setFirstIngredient("");
        recipeDto.setSecondIngredient("");
        recipeDto.setThirdIngredient("");
        recipeDto.setFourthIngredient("");
        recipeDto.setFifthIngredient("");

        return recipeDto;
    }
}
