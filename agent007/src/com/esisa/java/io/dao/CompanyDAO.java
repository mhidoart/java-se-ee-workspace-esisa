package com.esisa.java.io.dao; //models ou entity ou beans 
//app 3 tiers

import java.util.List;

import com.esisa.java.io.models.Company;

public interface CompanyDAO { //pour l'abstraction et a ne pas bloque un choix
	public void save(List<Company> companies);
	public List<Company> load();

}
