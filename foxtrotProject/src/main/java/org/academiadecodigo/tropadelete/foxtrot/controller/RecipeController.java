package org.academiadecodigo.tropadelete.foxtrot.controller;

import org.academiadecodigo.tropadelete.foxtrot.dto.RecipeDtoToRecipeAssembler;
import org.academiadecodigo.tropadelete.foxtrot.dto.RecipeToRecipeDtoAssembler;
import org.academiadecodigo.tropadelete.foxtrot.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private RecipeService recipeService;

    private RecipeToRecipeDtoAssembler recipeToRecipeDtoAssembler;
    private RecipeDtoToRecipeAssembler recipeDtoToRecipeAssembler;

    @Autowired
    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String showRegisterPage(Model model){

        return "recipe/recipeRegister.html";
    }
}
