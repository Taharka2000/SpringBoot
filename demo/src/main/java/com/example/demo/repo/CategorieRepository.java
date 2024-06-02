package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Categorie;

@CrossOrigin("http://localhost:4200/") // pour autoriser angular
@RepositoryRestResource(path = "cat")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
