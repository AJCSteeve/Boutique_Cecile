package com.example.cecile.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "categorie",fetch = FetchType.LAZY)
    private List<Produit> produit;


    public Categorie(Long id, String name, List<Produit> produit) {
        this.id = id;
        this.name = name;
        this.produit = produit;
    }

    public Categorie(String name, List<Produit> produit) {
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

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", produit=" + produit +
                '}';
    }
}
