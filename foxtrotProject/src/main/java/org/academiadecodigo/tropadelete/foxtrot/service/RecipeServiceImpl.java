package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.dao.IngredientDao;
import org.academiadecodigo.tropadelete.foxtrot.dao.RecipeDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeDao recipeDao;
    private IngredientDao ingredientDao;

    @Autowired
    public void setRecipeDao(RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }

    @Autowired
    public void setIngredientDao(IngredientDao ingredientDao) {
        this.ingredientDao = ingredientDao;
    }

    public void addRecipe(){

        Recipe recipe = new Recipe();
        recipeDao.saveOrUpdate(recipe);
    }
}
