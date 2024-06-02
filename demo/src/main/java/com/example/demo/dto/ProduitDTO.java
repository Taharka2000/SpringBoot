package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDTO {
private Long idProduit;
private String nomProduit;
//pour ne par faire apparaitre un attribut 
private Double prixProduit;
private Date dateCreation;
//pour faire apparaitre qu'un seul proprietes sur un categorie
private Categorie categorie;
//on fait comme ca
private String nomCat;
}