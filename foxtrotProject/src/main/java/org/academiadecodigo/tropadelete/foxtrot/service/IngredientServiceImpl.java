package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.dao.IngredientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {

    private IngredientDao ingredientDao;

    @Autowired
    public IngredientDao getIngredientDao() {
        return ingredientDao;
    }

    @Autowired
    public void setIngredientDao(IngredientDao ingredientDao) {
        this.ingredientDao = ingredientDao;
    }
}
