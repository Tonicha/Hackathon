package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;

import java.util.List;

public interface RecipeService {

    void addRecipe(Recipe recipe);

    List<Recipe> search(String ingredient);
}
