package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.dao.RecipeDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipeServiceImpl implements RecipeService {

    private RecipeDao recipeDao;

    @Autowired
    public void setRecipeDao(RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }


    public void addRecipe(){

        Recipe recipe = new Recipe();
        recipeDao.saveOrUpdate(recipe);
    }
}
