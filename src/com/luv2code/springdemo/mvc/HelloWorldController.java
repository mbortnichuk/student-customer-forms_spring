package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mbortnic on 4/3/19.
 */

@Controller
@RequestMapping("/hello") // parent mapping
public class HelloWorldController {

    // need a controller method to show the initial html form
    @RequestMapping("/showForm") // sub mappings
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request parameter from html form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String res = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", res);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        // read the request parameter from html form
//        String theName = request.getParameter("studentName"); -> replaced by RequestParam

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String res = "Hey my Friend from v3! " + theName;

        // add message to the model
        model.addAttribute("message", res);

        return "helloworld";
    }


}
