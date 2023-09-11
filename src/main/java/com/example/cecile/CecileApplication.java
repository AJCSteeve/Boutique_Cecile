package com.example.cecile;

import com.example.cecile.entity.Categorie;
import com.example.cecile.entity.Produit;
import com.example.cecile.repository.CategorieRepository;
import com.example.cecile.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CecileApplication implements CommandLineRunner {

    @Autowired
    private ProduitRepository prodRepo;
    @Autowired
    private CategorieRepository catRepo;
    public static void main(String[] args) {
        SpringApplication.run(CecileApplication.class, args);}


    @Override
    public void run(String... args) throws Exception {

        Categorie categorie1 = new Categorie();
        Categorie categorie2 = new Categorie();
        Categorie categorie3 = new Categorie();
        categorie1.setName("top");
        categorie2.setName("pantalon");
        categorie3.setName("dress");
        catRepo.save(categorie1);
        catRepo.save(categorie2);
        catRepo.save(categorie3);


        Produit produit1 = new Produit();
        Produit produit2 = new Produit();
        Produit produit3 = new Produit();
        produit1.setName("t-shirt");
        produit2.setName("jean");
        produit3.setName("robe");
        produit1.setPrice(15.0f);
        produit2.setPrice(25.0f);
        produit3.setPrice(20.50f);
        produit1.setCategorie(categorie1);
        produit2.setCategorie(categorie2);
        produit3.setCategorie(categorie3);

        prodRepo.save(produit1);
        prodRepo.save(produit2);
        prodRepo.save(produit3);

//        System.out.println(catRepo.findAll().toString());
//        System.out.println(prodRepo.findAll().toString());
//        System.out.println(categorie3.getProduit().toString());




    }
}
