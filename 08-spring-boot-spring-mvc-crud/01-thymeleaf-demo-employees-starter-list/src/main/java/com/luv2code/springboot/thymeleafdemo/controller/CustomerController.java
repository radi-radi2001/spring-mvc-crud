package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "employees/customer-form";
    }
}
