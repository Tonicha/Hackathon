package org.academiadecodigo.tropadelete.foxtrot.dao.jpa;

import org.academiadecodigo.tropadelete.foxtrot.dao.IngredientDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Ingredient;
import org.springframework.stereotype.Component;

@Component
public class JpaIngredientDao extends AbstractDao<Ingredient> implements IngredientDao {

    public JpaIngredientDao() {
        super(Ingredient.class);
    }
}
