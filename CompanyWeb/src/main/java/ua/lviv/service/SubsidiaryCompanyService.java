package ua.lviv.service;

import java.util.List;

import ua.lviv.entity.SubsidiaryCompany;

public interface SubsidiaryCompanyService {

	void addSubsidiaryCompany(String name, String annualEarnings);
	void editSubsidiaryCompany(String name, String annualEarnings);
	void deleteSubsidiaryCompany(String name, String annualEarnings);
	List<SubsidiaryCompany> viewAll();
}
