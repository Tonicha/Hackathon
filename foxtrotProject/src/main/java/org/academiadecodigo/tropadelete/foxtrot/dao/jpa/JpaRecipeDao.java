package org.academiadecodigo.tropadelete.foxtrot.dao.jpa;

import org.academiadecodigo.tropadelete.foxtrot.dao.RecipeDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class JpaRecipeDao extends AbstractDao<Recipe> implements RecipeDao {

    public JpaRecipeDao(){
        super(Recipe.class);
    }

}
