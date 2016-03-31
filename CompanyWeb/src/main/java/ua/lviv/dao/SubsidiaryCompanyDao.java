package ua.lviv.dao;

import java.util.List;


import ua.lviv.entity.SubsidiaryCompany;

public interface SubsidiaryCompanyDao {

	List<SubsidiaryCompany> viewAll();	
	void addSubsidiaryCompany(SubsidiaryCompany subsidiaryCompany);
	void editSubsidiaryCompany(SubsidiaryCompany subsidiaryCompany);
	void deleteSubsidiaryCompany(SubsidiaryCompany subsidiaryCompany);
}
