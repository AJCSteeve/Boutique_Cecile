package com.example.cecile.repository;

import com.example.cecile.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
    List<Categorie> findByNameIsContainingIgnoreCase(String name);
}
