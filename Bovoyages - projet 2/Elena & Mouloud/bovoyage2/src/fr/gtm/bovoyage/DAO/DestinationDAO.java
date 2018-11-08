package fr.gtm.bovoyage.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;





/**
 * Interface DAO<br>
 * Contient l'ensemble des méthodes permettant la gestion des enregistrements pour une Destination
 */
public class DestinationDAO {
	private static final Logger LOG = Logger.getLogger(DestinationDAO.class.getName());
	private DataSource ds;
	
	public DestinationDAO(DataSource ds) {
		this.ds = ds;
	}

	public List<Destination> getAllDestinations(){
		List<Destination> destinations = new ArrayList<>();
		try(Connection cnx = ds.getConnection()){
			String sql = "SELECT * FROM destinations";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				destinations.add(createDestination(rs));
			}
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, "Erreur", e);
		}
		return destinations;
	}

	private Destination createDestination(ResultSet rs) throws SQLException {
		Destination destination = new Destination();
		long id = rs.getLong("pk_destination");
		destination.setRegion(rs.getString("region"));
		destination.setDescription(rs.getString("description"));
		destination.setId(id);
		destination.setImages(getImageById(id));
		return destination;
	}

	private List<String> getImageById(long id) {
		List<String> images = new ArrayList<>();
		try {
			Connection cnx = ds.getConnection();
			String sql = " select image from images where fk_destination = ? ";
			PreparedStatement pst = cnx.prepareStatement (sql);
			pst.setLong (1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				images.add(rs.getString("image"));
			}
					
			//return images;
		} catch (SQLException e) {
			
			LOG.log(Level.SEVERE, "erreur de connection", e);
		}
		
		return images;
	}
	
	

	public List<DatesVoyage> getDatesVoyages(long id) {
		List<DatesVoyage> datesVoyages = new ArrayList<>();
		
		Connection cnx;
		try {
			cnx = ds.getConnection();
			String sql = "Select dv.date_depart, dv.date_retour, dv.prixHT from dates_voyages dv,"
					+ " destinations d where dv.fk_destinations=d.pk_destination and d.pk_destination = ? ";
		
			PreparedStatement pst = cnx.prepareStatement(sql);
			pst.setLong(1, id);
			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				datesVoyages.add(createDatesVoyage(rs));
			}
		
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, "erreur", e);
		} 
		return datesVoyages;
	}

	private DatesVoyage createDatesVoyage(ResultSet rs) {
		DatesVoyage datesVoyage = new DatesVoyage();
		try {
			datesVoyage.setDateAller(rs.getDate("date_depart"));
			datesVoyage.setDateRetour(rs.getDate("date_retour"));
	        datesVoyage.setPrixHT(rs.getDouble("prixHT"));
	        datesVoyage.setId(rs.getLong("pk_date_voyage"));
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, "erreur", e);
		}
        		
		return datesVoyage;
	}

	public List<Destination> getDestinationsById(long id) {
		
		List<Destination> destinationsId = new ArrayList<>();
		
		Connection cnx;
		try {
			cnx = ds.getConnection();
			String sql = "Select d.region, d.description from destination d,"
					+ " where d.pk_destinations = ? ";
		
			PreparedStatement pst = cnx.prepareStatement(sql);
			pst.setLong(1, id);
			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				destinationsId.add(createDestination(rs));
			}
		
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, "erreur", e);
		} 
		return destinationsId;
	}

	 
	
}
