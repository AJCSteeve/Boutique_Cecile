package com.example.cecile.repository;

import com.example.cecile.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    List<Produit> findByNameIsContainingIgnoreCase(String name);
}
