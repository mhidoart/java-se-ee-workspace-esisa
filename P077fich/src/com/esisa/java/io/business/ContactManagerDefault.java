package com.esisa.java.io.business;

import java.util.List;
import java.util.Vector;

import com.esisa.java.io.dao.CompanyDAO;
import com.esisa.java.io.dao.ContactDAO;
import com.esisa.java.io.models.Company;
import com.esisa.java.io.models.Contact;

public class ContactManagerDefault implements ContactManager {
	public static final int SAVE_AUTO = 0;
	public static final int SAVE_REQUEST = 1;
	
	private int saveStrategy = SAVE_AUTO;
	
	private List<Company> companiesList;
	private List<Contact> contacts;
	
	private CompanyDAO companyDAO;
	private ContactDAO contactDAO;

	public ContactManagerDefault() {
		companiesList = new Vector<>();
		contacts = new Vector<>();
	}

	public ContactManagerDefault(CompanyDAO companyDAO,ContactDAO contactDAO) {
		setCompanyDAO(companyDAO);
		setContactDAO(contactDAO);
	}
	

	public ContactDAO getContactDAO() {
		return contactDAO;
	}

	public void setContactDAO(ContactDAO contactDAO) {
		this.contactDAO = contactDAO;
		contacts = contactDAO.load();
		if(contacts == null) {
			contacts=new Vector<>();
		}
	}

	public CompanyDAO getCompanyDAO() {
		return companyDAO;
	}

	public void setCompanyDAO(CompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
		companiesList = companyDAO.load();
		if (companiesList ==null) {
			companiesList = new Vector<>(); //implementation de list
		}
	}

	public int getSaveStrategy() {
		return saveStrategy;
	}

	public void setSaveStrategy(int saveStrategy) {
		this.saveStrategy = saveStrategy;
	}

	@Override
	public void add(Contact contact) {
		contacts.add(contact);
		if(saveStrategy==SAVE_AUTO)
		{
			contactDAO.save(contacts);
		}
	}

	@Override
	public void add(Company company) {
		companiesList.add(company);
		if (saveStrategy == SAVE_AUTO) {
			companyDAO.save(companiesList);
		}
		
	}

	@Override
	public Company getCompany(int id) {
		
		return null;
	}

	@Override
	public Contact getContact(int id) {
		
		return null;
	}

	@Override
	public List<Company> companies() {
		
		return companiesList;
	}

	@Override
	public List<Company> companies(String keyword) {

		return null;
	}
	
	public void save() {
		companyDAO.save(companiesList);
		contactDAO.save(contacts);
	}

}
