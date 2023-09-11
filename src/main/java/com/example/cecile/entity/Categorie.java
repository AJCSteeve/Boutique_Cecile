package com.example.cecile.entity;

public class Categorie {

    private Long id;


    private String name;


    private Produit produit;


    public Categorie(Long id, String name, Produit produit) {
        this.id = id;
        this.name = name;
        this.produit = produit;
    }

    public Categorie(String name, Produit produit) {
        this.name = name;
        this.produit = produit;
    }

    public Categorie() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
