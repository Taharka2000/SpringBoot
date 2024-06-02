package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.ProduitDTO;
import com.example.demo.entities.Produit;
import com.example.demo.services.ProduitService;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin // pour la securite
public class ProduitRESTController {
    @Autowired
    ProduitService produitService;

    @GetMapping
    public List<ProduitDTO> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public ProduitDTO geProduitByIDProduit(@PathVariable("id") Long id) {
        return produitService.getProduit(id);
    }

    @PostMapping
    public ProduitDTO createProduit(@RequestBody ProduitDTO produitDTO) {
        return produitService.saveProduit(produitDTO);
    }

    @PutMapping
    public ProduitDTO updateProduit(@RequestBody ProduitDTO produitDTO) {
        return produitService.updateProduit(produitDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable("id") Long id) {
        produitService.deleteProduitById(id);
    }

    @GetMapping("/prodscat/{idCat}")
    public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
        return produitService.findByCategorieIdCat(idCat);
    }

    @GetMapping("/prodsByName/{nom}")
    public List<Produit> findByNomProduitContains(@PathVariable("nom") String nom) {
        return produitService.findByNomProduitContains(nom);
    }
}
