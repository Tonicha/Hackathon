package org.academiadecodigo.tropadelete.foxtrot.dao;

import org.academiadecodigo.tropadelete.foxtrot.model.Ingredient;

public class JpaIngredientDao extends AbstractDao<Ingredient> implements IngredientDao {

    public JpaIngredientDao() {
        super(Ingredient.class);
    }
}
