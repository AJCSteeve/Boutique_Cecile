package com.example.cecile.service;

import com.example.cecile.WebController.entityDto.ProduitDto;
import com.example.cecile.entity.Produit;
import com.example.cecile.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Produit fetchById(Long id) throws Exception{
        Optional<Produit> produit = produitRepository.findById(id);
        return produit.orElseThrow(() -> new Exception());
    }

    public List<Produit> fetchAll(){return produitRepository.findAll();}

    public void save (ProduitDto produitDto){
        Produit newProduit = new Produit(produitDto.getName(),produitDto.getCategorie());
        produitRepository.save(newProduit);
    }

    public void remove(Long id){produitRepository.deleteById(id);}
}
