package com.esisa.java.io.business;

import java.util.List;
import java.util.Vector;

import com.esisa.java.io.DAO.CompanyDAO;
import com.esisa.java.io.models.Company;
import com.esisa.java.io.models.Contact;

public class ContactManagerDefault implements ContactManager{
	public static final int AUTO_SAVE=0;
	public static final int AUTO_REQUEST=1;
	private int saveStrategy=AUTO_SAVE;
	private List<Company> companiesList;
	private List<Contact> contactsList;

	private  CompanyDAO companyDAO;

	public ContactManagerDefault(CompanyDAO companyDAO) {
		super();
		setCompanyDAO(companyDAO);
	}


	public ContactManagerDefault() {
		// TODO Auto-generated constructor stub
		companiesList= new Vector<>();
		contactsList=new Vector<>();

	}


	public int getSaveStrategy() {
		return saveStrategy;
	}


	public void setSaveStrategy(int saveStrategy) {
		this.saveStrategy = saveStrategy;
	}


	public CompanyDAO getCompanyDAO() {
		return companyDAO;
	}


	public void setCompanyDAO(CompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
		companiesList=companyDAO.load();
		if(companiesList== null) {
			companiesList= new Vector<>();
		}
	}


	@Override
	public void add(Contact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub
		companiesList.add(company);
		if(saveStrategy==AUTO_SAVE) {
			companyDAO.save(companiesList);
		}
	}

	@Override
	public Company getcompany(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> companies() {
		// TODO Auto-generated method stub
		return companiesList;
	}

	@Override
	public List<Company> companies(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void save() {
		// TODO Auto-generated method stub
		companyDAO.save(companiesList);
	}


}
