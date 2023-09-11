package com.example.cecile.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategorieController {

    @GetMapping("/categorie")
    public String categorie()
}
