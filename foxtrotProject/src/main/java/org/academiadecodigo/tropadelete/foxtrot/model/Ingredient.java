package org.academiadecodigo.tropadelete.foxtrot.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Ingredient extends AbstractModel {

    private String name;

    private List<Recipe> recipes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

}
