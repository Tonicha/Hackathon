package org.academiadecodigo.tropadelete.foxtrot.controller;

import org.academiadecodigo.tropadelete.foxtrot.dto.CustomerDto;
import org.academiadecodigo.tropadelete.foxtrot.dto.assembler.CustomerToDtoAssembler;
import org.academiadecodigo.tropadelete.foxtrot.dto.assembler.DtoToCustomerAssembler;
import org.academiadecodigo.tropadelete.foxtrot.model.Customer;
import org.academiadecodigo.tropadelete.foxtrot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;
    private CustomerToDtoAssembler customerToDtoAssembler;
    private DtoToCustomerAssembler dtoToCustomerAssembler;

    //add
    //login

    @RequestMapping(method = RequestMethod.GET, path = {"/register"})
    public String addCustomer(Model model) {
        model.addAttribute("customer", new CustomerDto());
        return "signup/signUp";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", "", "/register"})
    public String saveCustomer(@Valid @ModelAttribute("customer") CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "signup/signUp";
        }

        if (!customerDto.getPassword().equals(customerDto.getConfirmedPassword())) {
            redirectAttributes.addFlashAttribute("lastAction", "Password does not match!");
            return "signup/signUp";
        }

        Customer savedCustomer = customerService.addCustomer(dtoToCustomerAssembler.convert(customerDto));

        redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedCustomer.getUserName());
        return "redirect:/customer/" + savedCustomer.getId();
    }


    @RequestMapping(method = RequestMethod.GET, path = {"/login", "/", ""})
    public String login(Model model) {
        model.addAttribute("customer", new CustomerDto());
        return "login/login";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/validate")
    public String validate(@ModelAttribute("customer") CustomerDto customerDto) {
        CustomerDto savedCustomer = customerToDtoAssembler.convert(customerService.getByUsername(customerDto.getUsername()));

        if (savedCustomer == null) {
            return "redirect:/customer/login";
        }

        if (!savedCustomer.getPassword().equals(customerDto.getPassword())) {
            return "redirect:/customer/login";
        }

        return "redirect:/recipe/main-page";
    }


    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }


    public void setCustomerToDtoAssembler(CustomerToDtoAssembler customerToDtoAssembler) {
        this.customerToDtoAssembler = customerToDtoAssembler;
    }

    public void setDtoToCustomerAssembler(DtoToCustomerAssembler dtoToCustomerAssembler) {
        this.dtoToCustomerAssembler = dtoToCustomerAssembler;
    }
}
