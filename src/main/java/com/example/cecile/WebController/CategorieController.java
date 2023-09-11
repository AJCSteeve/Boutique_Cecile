package com.example.cecile.WebController;

import com.example.cecile.WebController.entityDto.CategorieDto;
import com.example.cecile.entity.Categorie;
import com.example.cecile.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategorieController {

    @Autowired
    private CategorieService catServ;

    @GetMapping("/categories")
    public String displayAllCategorie(Model model){
        try{
            List<Categorie> categorieList = catServ.fetchAll();
            model.addAttribute("categories",categorieList);

        } catch (Exception e){
            e.printStackTrace();
        }
    return "categories";
    }

    @GetMapping("/categories/{id}")
    public String displayCategorie(@PathVariable Long id, Model model){
        try{
            Categorie c = catServ.fetchById(id);
            model.addAttribute("categorie",c);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "categorie-details";
    }
    @GetMapping("/categories/add")
    public String addCategorieForm(){return "add-categories";}

    @PostMapping("/categories/add")
    public String addCategorieSubmission(CategorieDto categorieDto){
        catServ.save(categorieDto);
        return "redirect:/categories";
    }
    @DeleteMapping("/categories/delete/{id}")
    public String deleteCategorie (@PathVariable Long id, Model model) {
        catServ.remove(id);
        return "redirect:/categories";
    }
}
