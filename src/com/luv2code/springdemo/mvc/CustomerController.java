package com.luv2code.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by mbortnic on 4/3/19.
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm") // @Valid will perform validation rules on Customer object; results of validation placed in the bindingResult
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
//        System.out.println("First name: |" + customer.getFirstName() + "|");
        System.out.println("Last name: |" + customer.getLastName() + "|\n");
//        System.out.println("Free passes: |" + customer.getFreePasses() + "|");
//        System.out.println("Postal Code: |" + customer.getPostalCode() + "|\n");

        System.out.println("Binding result: " + bindingResult + "\n\n");

        if (bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }

    // add an initBinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }



}
