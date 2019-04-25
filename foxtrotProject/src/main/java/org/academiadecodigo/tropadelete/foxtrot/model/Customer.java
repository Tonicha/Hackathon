package org.academiadecodigo.tropadelete.foxtrot.model;

import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer extends AbstractModel {

    private int id;
    private String userName;
    private String email;
    private String password;
    private Date creationDate;

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

    public Date getCreationDate() {
        return creationDate;
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
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
                ", recipes=" + recipes +
                '}';
    }
}