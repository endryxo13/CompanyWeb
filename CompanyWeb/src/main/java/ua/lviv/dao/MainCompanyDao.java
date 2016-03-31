package ua.lviv.dao;

import java.util.List;

import ua.lviv.entity.MainCompany;

public interface MainCompanyDao {
	
List<MainCompany> viewAll();	
void addMainCompany(MainCompany mainCompany);
void editMainCompany(MainCompany mainCompany);
void deleteMainCompany(MainCompany mainCompany);

}
