package ua.lviv.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.dao.SubsidiaryCompanyDao;
import ua.lviv.entity.SubsidiaryCompany;
import ua.lviv.service.SubsidiaryCompanyService;
@Service
public class SubsidiaryCompanyServiceImpl implements SubsidiaryCompanyService {

	@Autowired
	private SubsidiaryCompanyDao subsidiaryCompanyDao;

	@Transactional
	public void addSubsidiaryCompany(String name, String annualEarnings) {
		subsidiaryCompanyDao.addSubsidiaryCompany(new SubsidiaryCompany(name,Integer.parseInt(annualEarnings)));
	}

	@Transactional
	public void editSubsidiaryCompany(String name, String annualEarnings) {
		subsidiaryCompanyDao.editSubsidiaryCompany(new SubsidiaryCompany(name,Integer.parseInt(annualEarnings)));
	}

	@Transactional
	public void deleteSubsidiaryCompany(String name, String annualEarnings) {
		subsidiaryCompanyDao.deleteSubsidiaryCompany(new SubsidiaryCompany(name,Integer.parseInt(annualEarnings)));
	}

	@Transactional
	public List<SubsidiaryCompany> viewAll() {
			return subsidiaryCompanyDao.viewAll();
	}

}
