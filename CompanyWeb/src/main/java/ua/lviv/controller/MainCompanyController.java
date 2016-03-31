package ua.lviv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.entity.MainCompany;
import ua.lviv.service.MainCompanyService;

@Controller
public class MainCompanyController {

	@Autowired
	private MainCompanyService mainCompanyService;
	
	@RequestMapping(value="/viewAllMainComp")
	public String showAllMainComp(Model model){
		List<MainCompany> allMainCompanys=mainCompanyService.viewAll();
		model.addAttribute("mainCompanys", allMainCompanys);
		return "mainCompany-all";
	}
	@RequestMapping(value="/add")
	public String addMainCompanyPage(){
		return "mainCompany-new";
	}
	@RequestMapping(value="/addMainCompany", method = RequestMethod.POST)
	public String addMainCompany
	        (@RequestParam(value = "name") String name,
			@RequestParam(value = "annualEarnings") String annualEarnings){
		mainCompanyService.addMainCompany(name, annualEarnings);
	return  "redirect:/viewAllMainComp";
	}
	@RequestMapping(value = "/deleteMain")
	public String pageDeleteMain() {
		return "mainCompany-delete";
	}
				@RequestMapping(value="/deleteMainCompany")
				public String deleteMainCompany
				        (@RequestParam(value = "name") String name,
						@RequestParam(value = "annualEarnings") String annualEarnings){
					mainCompanyService.deleteMainCompany(name, annualEarnings);
				return  "redirect:/viewAllMainComp";
				}

}

