package ua.lviv.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.dao.MainCompanyDao;
import ua.lviv.entity.MainCompany;

@Repository
public class MainCompanyDaoImp implements MainCompanyDao {
@PersistenceContext(unitName="Primary")
	private EntityManager em;

	@Transactional
	public List<MainCompany> viewAll() {
		return em.createQuery("from MainCompany").getResultList();
	}
@Transactional
	public void addMainCompany(MainCompany mainCompany) {
		em.persist(mainCompany);
		
	}
@Transactional
	public void editMainCompany(MainCompany mainCompany) {
		em.merge(mainCompany);
		
	}
@Transactional
	public void deleteMainCompany(MainCompany mainCompany) {
	em.remove(mainCompany);		
	}

}
