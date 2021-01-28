package com.esisa.java.io.DAO;

import java.util.List;

import com.esisa.java.io.models.Company;

public interface CompanyDAO {
	public void save(List<Company> companies);///linterface liste mere de vector linked list.....etc
	public List<Company>  load();
}
