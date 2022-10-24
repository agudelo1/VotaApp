package com.example.demo.servicio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Votante;

public interface VotanteService extends JpaRepository<Votante, Integer> {

}
