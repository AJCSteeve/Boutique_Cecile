package com.example.cecile.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "price")
    private Float price;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;


    public Produit(Long id, String name, Float price, Categorie categorie) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categorie = categorie;
    }

    public Produit(String name, Float price, Categorie categorie) {
        this.name = name;
        this.price = price;
        this.categorie = categorie;
    }

    public Produit(String name, Categorie categorie) {
        this.name = name;
        this.categorie = categorie;
    }

    public Produit() {}

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categorie=" + categorie +
                '}';
    }
}
