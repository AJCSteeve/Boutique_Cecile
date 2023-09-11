package com.example.cecile.WebController;

import com.example.cecile.entity.Categorie;
import com.example.cecile.repository.CategorieRepository;
import io.micrometer.common.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategorieController {

    private CategorieRepository catRepo;

    @GetMapping("/categorie")
    public String categorie(Model model, @RequestParam(name ="categorie",required = false,defaultValue = "Categorie"),
                            @RequestParam(name = "keyword",defaultValue = " ") String keyword)
    {
        <Categorie> categories = catRepo.findByNameIsContainingIgnoreCase(keyword);

        model.addAttribute("name",);
        return "categorie";
    }

}
