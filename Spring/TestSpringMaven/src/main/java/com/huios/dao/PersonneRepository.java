package com.huios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.huios.metier.Personne;

@Repository
public interface PersonneRepository extends JpaRepository <Personne, Integer> {

}
