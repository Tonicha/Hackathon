package org.academiadecodigo.tropadelete.foxtrot.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer extends AbstractModel {

    private String userName;
    private String email;
    private String password;

    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "customer",

            fetch = FetchType.EAGER
    )
    private List<Recipe> recipes = new ArrayList<>();

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }


    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
        recipe.setCustomer(this);
    }

    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
        recipe.setCustomer(null);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", recipes=" + recipes +
                '}';
    }
}