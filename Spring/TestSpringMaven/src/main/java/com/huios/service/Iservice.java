package com.huios.service;

import java.util.List;

import com.huios.metier.Personne;

public interface Iservice {
	public void ajouter(Personne p);
	public void modifier(Personne p);
	public void supprimer(int id);
	public List<Personne> findAll();
	public Personne getPersonneById(int id);
}
