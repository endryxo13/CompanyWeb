package ua.lviv.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class MainCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int idMC;
	@Column
private String name;
private int annualEarnings;
@OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE},fetch=FetchType.LAZY, mappedBy="mainCompany")
private List<SubsidiaryCompany> subsidiaryCompany;

public MainCompany() {
}

public MainCompany(String name, int annualEarnings) {
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
	return "MainCompany [name=" + name + ", annualEarnings=" + annualEarnings + "]";
}

}
