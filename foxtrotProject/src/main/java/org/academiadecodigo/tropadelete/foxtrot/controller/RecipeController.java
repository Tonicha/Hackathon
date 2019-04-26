package org.academiadecodigo.tropadelete.foxtrot.controller;

import org.academiadecodigo.tropadelete.foxtrot.dto.CustomerDto;
import org.academiadecodigo.tropadelete.foxtrot.dto.RecipeDto;
import org.academiadecodigo.tropadelete.foxtrot.dto.RecipeDtoToRecipeAssembler;
import org.academiadecodigo.tropadelete.foxtrot.dto.RecipeToRecipeDtoAssembler;
import org.academiadecodigo.tropadelete.foxtrot.model.Recipe;
import org.academiadecodigo.tropadelete.foxtrot.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    private RecipeService recipeService;

    private RecipeToRecipeDtoAssembler recipeToRecipeDtoAssembler;
    private RecipeDtoToRecipeAssembler recipeDtoToRecipeAssembler;

    @Autowired
    public void setRecipeToRecipeDtoAssembler(RecipeToRecipeDtoAssembler recipeToRecipeDtoAssembler) {
        this.recipeToRecipeDtoAssembler = recipeToRecipeDtoAssembler;
    }

    @Autowired
    public void setRecipeDtoToRecipeAssembler(RecipeDtoToRecipeAssembler recipeDtoToRecipeAssembler) {
        this.recipeDtoToRecipeAssembler = recipeDtoToRecipeAssembler;
    }

    @Autowired
    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/add")
    public String showRegisterPage(@ModelAttribute("recipeDto") RecipeDto recipeDto, Model model){

        model.addAttribute("recipeDto", recipeDto);
        return "recipe/recipeRegister";

    }

    @RequestMapping(method = RequestMethod.GET, path = "/search")
    public String searchRecipe() {

        //recipeService.search(ingredient);
        return "";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public String addRecipe(@Valid @ModelAttribute("recipeDto") RecipeDto recipeDto, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "recipe/recipeRegister";
        }

        Recipe recipe = recipeDtoToRecipeAssembler.assemble(recipeDto);

        recipeService.addRecipe(recipe);

        return "recipe/main-page";

    }

    @RequestMapping(method = RequestMethod.GET, path = "/main-page")
    public String showMainPage(@ModelAttribute("customer")CustomerDto customerDto){

        //Verify customer login
        return null;
    }


}
