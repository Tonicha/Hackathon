package org.academiadecodigo.tropadelete.foxtrot.dao;

import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;

public class JPARecipeDao extends AbstractDao<Recipe> implements RecipeDao {

    public JPARecipeDao(){
        super(Recipe.class);
    }

}
