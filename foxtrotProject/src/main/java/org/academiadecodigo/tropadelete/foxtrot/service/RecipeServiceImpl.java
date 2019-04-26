package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.dao.IngredientDao;
import org.academiadecodigo.tropadelete.foxtrot.dao.RecipeDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Ingredient;
import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
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

    @Override
    @Transactional
    public void addRecipe(Recipe recipe){
        recipeDao.saveOrUpdate(recipe);
    }

    @Override
    public List<Recipe> search(String ingredient) {
        List<Recipe> recipes = recipeDao.findAll();

        List<Recipe> foundRecipes = new LinkedList<>();

        for (Recipe recipe : recipes ) {
           if(recipe.getIngredients().contains(ingredient)){
               foundRecipes.add(recipe);
           }
        }

        if (foundRecipes.size() < 1) {
            return null;
        }

        return foundRecipes;
    }

}
