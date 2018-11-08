package fr.gtm.bovoyage.service;

import java.util.List;
import javax.sql.DataSource;

import fr.gtm.bovoyage.DAO.DestinationDAO;
import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;


public class DestinationService {
	private DestinationDAO dao;

	public DestinationService(DataSource ds) {
		this.dao =new DestinationDAO(ds);
	}
	
	public List<Destination> getAllDestinations(){
	return dao.getAllDestinations();
	}

	public List<DatesVoyage> getDatesVoyages(long id) {
		
		return dao.getDatesVoyages (id);
	}
	
	public List<Destination> getDestinationById (long id) {
		return dao.getDestinationsById (id);
	}

}
