package com.huios.presentation;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.metier.Personne;
import com.huios.service.Iservice;
import com.huios.service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		//Charger le conteneur spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-data.xml");
		// Récupérer les beans
		Personne p = context.getBean("personne",Personne.class);
		Iservice service = context.getBean("service",ServiceImpl.class);
		
		/*p.setAge(12);
		p.setNom("ZAM");
		p.setPrenom("ELISE");
		
		service.ajouter(p);*/
		//service.supprimer(2);
		/*Personne modif = service.getPersonneById(3);
		modif.setPrenom("CHRISTIAN 2");
		service.modifier(modif);*/
		
		List<Personne> list = service.findAll();
		for(Personne pers : list) {
			System.out.println(pers);
		}
		context.close();
		
	}

}
