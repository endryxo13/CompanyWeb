package ua.lviv.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.dao.SubsidiaryCompanyDao;
import ua.lviv.entity.SubsidiaryCompany;
@Repository
public class SubsidiaryCompanyDaoImp implements SubsidiaryCompanyDao {
	@PersistenceContext(unitName = "Primary")
	private EntityManager em;
	
	@Transactional
		public List<SubsidiaryCompany> viewAll() {
		return em.createQuery("from SubsidiaryCompany").getResultList();
	}
	@Transactional
	public void addSubsidiaryCompany(SubsidiaryCompany subsidiaryCompany) {
		em.persist(subsidiaryCompany);		
	}
	@Transactional
	public void editSubsidiaryCompany(SubsidiaryCompany subsidiaryCompany) {
		em.merge(subsidiaryCompany);
		
	}
	@Transactional
	public void deleteSubsidiaryCompany(SubsidiaryCompany subsidiaryCompany) {
		em.remove(subsidiaryCompany);
		
	}

}
