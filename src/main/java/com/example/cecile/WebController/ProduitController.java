package com.example.cecile.WebController;

import com.example.cecile.WebController.entityDto.ProduitDto;
import com.example.cecile.entity.Produit;
import com.example.cecile.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService prodServ;

    @GetMapping("/produits")
    public String displayAllProduits(Model model){
        try{
            List<Produit> produitList = prodServ.fetchAll();
            model.addAttribute("produits",produitList);

        } catch (Exception e){
            e.printStackTrace();
        }
        return "produits";
    }

    @GetMapping("/produits/{id}")
    public String displayProduit(@PathVariable Long id, Model model){
        try{
            Produit p = prodServ.fetchById(id);
            model.addAttribute("categorie",p);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "produit-details";
    }
    @GetMapping("/produits/add")
    public String addProduitForm(){return "add-produits";}

    @PostMapping("/produits/add")
    public String addProduitSubmission(ProduitDto produitDto){
        prodServ.save(produitDto);
        return "redirect:/produits";
    }
    @DeleteMapping("/produits/delete/{id}")
    public String deleteProduit (@PathVariable Long id, Model model) {
        prodServ.remove(id);
        return "redirect :/produits";
    }
}
