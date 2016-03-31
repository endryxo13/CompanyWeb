package ua.lviv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import ua.lviv.entity.SubsidiaryCompany;
import ua.lviv.service.SubsidiaryCompanyService;

@Controller
public class SubsidiaryCompanyController {

	@Autowired
	private SubsidiaryCompanyService subsidiaryCompanyService;
	
	@RequestMapping(value="/viewAllSubsidiaryComp")
	public String viewAllSubsidiaryComp(Model model){
		List<SubsidiaryCompany> allSubsidiaryCompanys=subsidiaryCompanyService.viewAll();
		model.addAttribute("subsidiaryCompanys", allSubsidiaryCompanys);
		return "subsidiaryCompany-all";
	}
	@RequestMapping(value="/addSubsidiary")
	public String addSubsidiaryCompanyPage(){
		return "subsidiaryCompany-new";
	}
	@RequestMapping(value="/addSubsidiaryCompany", method = RequestMethod.POST)
	public String addSubsidiaryCompany(@RequestParam(value = "name") String name,
			@RequestParam(value = "annualEarnings") String annualEarnings){
		subsidiaryCompanyService.addSubsidiaryCompany(name, annualEarnings);
	return  "redirect:/viewAllSubsidiaryComp";
	}
	@RequestMapping(value = "/deleteSubsidiary")
	public String pageDeleteSubsidiary() {
		return "subsidiaryCompany-delete";
	}
				@RequestMapping(value="/deleteSubsidiaryCompany")
				public String deleteSubsidiaryCompany
				        (@RequestParam(value = "name") String name,
						@RequestParam(value = "annualEarnings") String annualEarnings){
					subsidiaryCompanyService.deleteSubsidiaryCompany(name, annualEarnings); 
				return  "redirect:/viewAllSubsidiaryComp";
				}
}
