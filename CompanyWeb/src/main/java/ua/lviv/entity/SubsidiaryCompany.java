package ua.lviv.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class SubsidiaryCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int idSC;
	@Column
	private String name;
	private int annualEarnings;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	private MainCompany mainCompany;
	
	
	public SubsidiaryCompany() {
		}
	
	public SubsidiaryCompany(String name, int annualEarnings) {
		super();
		this.name = name;
		this.annualEarnings = annualEarnings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnnualEarnings() {
		return annualEarnings;
	}
	public void setAnnualEarnings(int annualEarnings) {
		this.annualEarnings = annualEarnings;
	}
	@Override
	public String toString() {
		return "SubsidiaryCompany [name=" + name + ", annualEarnings=" + annualEarnings + "]";
	}
	
}
