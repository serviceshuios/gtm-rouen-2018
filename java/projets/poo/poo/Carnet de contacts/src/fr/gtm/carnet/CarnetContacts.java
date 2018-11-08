package fr.gtm.carnet;

import java.util.ArrayList;
import java.util.List;

public class CarnetContacts {
	private List<Contact> contacts = new ArrayList<>();
	
	public void add(Contact contact) {
		contacts.add(contact);
	}
	
	public List<Contact> getAllContacts() {
		return contacts;
	}
}
