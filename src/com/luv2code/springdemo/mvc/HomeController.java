package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mbortnic on 3/29/19.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
//		System.out.println("something!!!");
        return "main-menu";
    }

}
