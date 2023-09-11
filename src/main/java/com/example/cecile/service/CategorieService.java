package com.example.cecile.service;

import com.example.cecile.WebController.entityDto.CategorieDto;
import com.example.cecile.entity.Categorie;
import com.example.cecile.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public Categorie fetchById(Long id) throws Exception {
        Optional<Categorie> categories =categorieRepository.findById(id);
        return categories.orElseThrow(() -> new Exception());
    }

    public List<Categorie> fetchAll() {return categorieRepository.findAll();}

    public void save(CategorieDto categorieDto) {
        Categorie newCategorie =new Categorie(categorieDto.getName());
        categorieRepository.save(newCategorie);
    }

    public void remove(Long id) {categorieRepository.deleteById(id);}
}
