package org.academiadecodigo.tropadelete.foxtrot.dto;

import org.academiadecodigo.tropadelete.foxtrot.model.Ingredient;
import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.academiadecodigo.tropadelete.foxtrot.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeDtoToRecipeAssembler {

    private RecipeService recipeService;

    @Autowired
    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public Recipe assemble(RecipeDto recipeDto){

        Recipe recipe = new Recipe();

        List<String> ingredients = new ArrayList<>();
        ingredients.add(recipeDto.getFirstIngredient());
        ingredients.add(recipeDto.getSecondIngredient());
        ingredients.add(recipeDto.getThirdIngredient());
        ingredients.add(recipeDto.getFourthIngredient());
        ingredients.add(recipeDto.getFifthIngredient());

        recipe.setName(recipeDto.getName());
        recipe.setDescription(recipeDto.getDescription());
        recipe.setIngredients(ingredients);

        return recipe;
    }

}
