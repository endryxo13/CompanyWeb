package ua.lviv.service;

import java.util.List;

import ua.lviv.entity.MainCompany;

public interface MainCompanyService {

	void addMainCompany(String name, String annualEarnings);
	void editMainCompany(String name, String annualEarnings);
	void deleteMainCompany(String name, String annualEarnings);
	List<MainCompany> viewAll();
}
