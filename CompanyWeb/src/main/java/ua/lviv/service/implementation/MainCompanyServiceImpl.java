package ua.lviv.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.dao.MainCompanyDao;
import ua.lviv.entity.MainCompany;
import ua.lviv.service.MainCompanyService;
@Service
public class MainCompanyServiceImpl implements MainCompanyService {
private List<MainCompany> mainCompanyL=new ArrayList<MainCompany>();

	@Autowired
	private MainCompanyDao mainCompanyDao;

	@Transactional
	public void addMainCompany(String name, String annualEarnings) {
		mainCompanyDao.addMainCompany(new MainCompany(name, Integer.parseInt(annualEarnings)));
	}

	@Transactional
	public void editMainCompany(String name, String annualEarnings) {
		mainCompanyDao.editMainCompany(new MainCompany(name, Integer.parseInt(annualEarnings)));
	}

	@Transactional
	public void deleteMainCompany(String name, String annualEarnings){
	mainCompanyDao.deleteMainCompany(new MainCompany(name, Integer.parseInt(annualEarnings)));
	}

	@Transactional
	public List<MainCompany> viewAll() {
			return mainCompanyDao.viewAll();
	}

}
