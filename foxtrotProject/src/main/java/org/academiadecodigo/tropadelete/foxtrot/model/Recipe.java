package org.academiadecodigo.tropadelete.foxtrot.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe extends AbstractModel{

    private String name;
    private String description;

    private List<String> ingredients = new ArrayList<>();

    @ManyToOne
    private Customer customer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }



    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}
