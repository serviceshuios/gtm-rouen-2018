package com.huios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.huios.dao.PersonneRepository;
import com.huios.metier.Personne;

@Service("service")
public class ServiceImpl implements Iservice {

	@Autowired
	private PersonneRepository dao;
	@Override
	public void ajouter(Personne p) {
		// TODO Auto-generated method stub
			dao.save(p);
	}

	@Override
	public void modifier(Personne p) {
		// TODO Auto-generated method stub
			dao.save(p);
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
			//dao.deleteById(id);
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Personne getPersonneById(int id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

}
