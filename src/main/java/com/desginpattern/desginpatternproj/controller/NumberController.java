package com.desginpattern.desginpatternproj.controller;

import com.desginpattern.desginpatternproj.model.NumberModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class NumberController {

    @GetMapping("/findGreatest")
    public String findGreatest(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2,
            Model model) {

        NumberModel numberModel = new NumberModel();
        int greatest = numberModel.findGreatest(num1, num2);

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("greatest", greatest);

        return "result"; // The name of the view to be displayed (result.jsp or result.html, depending on your setup).
    }
}

