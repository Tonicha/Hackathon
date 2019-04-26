package org.academiadecodigo.tropadelete.foxtrot.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RecipeDto {

    private Integer id;

    @NotBlank(message = "Name must be inserted.")
    private String name;

    @NotBlank(message = "Description must be inserted.")
    private String description;

    @NotBlank(message = "First ingredient is mandatory.")
    @Size(min = 2, max = 16)
    private String firstIngredient;

    @NotBlank(message = "Second ingredient is mandatory.")
    @Size(min = 2, max = 16)
    private String secondIngredient;

    private String thirdIngredient;

    private String fourthIngredient;

    private String fifthIngredient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getFirstIngredient() {
        return firstIngredient;
    }

    public void setFirstIngredient(String firstIngredient) {
        this.firstIngredient = firstIngredient;
    }

    public String getSecondIngredient() {
        return secondIngredient;
    }

    public void setSecondIngredient(String secondIngredient) {
        this.secondIngredient = secondIngredient;
    }

    public String getThirdIngredient() {
        return thirdIngredient;
    }

    public void setThirdIngredient(String thirdIngredient) {
        this.thirdIngredient = thirdIngredient;
    }

    public String getFourthIngredient() {
        return fourthIngredient;
    }

    public void setFourthIngredient(String fourthIngredient) {
        this.fourthIngredient = fourthIngredient;
    }

    public String getFifthIngredient() {
        return fifthIngredient;
    }

    public void setFifthIngredient(String fifthIngredient) {
        this.fifthIngredient = fifthIngredient;
    }
}
