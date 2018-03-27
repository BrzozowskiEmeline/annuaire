package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entities.Carnet;
import com.example.demo.Entities.Civilite;
import com.example.demo.services.CarnetServices;

@RestController
public class CarnetController {
//	ArrayList<Carnet> listeCarnets = new ArrayList<Carnet>(Arrays.asList(
//
//			new Carnet(1, Civilite.M, "Besson", "Luc", "1959-13-18", "0000000000", "5 avenue de l'Element", "75015",
//					"Paris"),
//			new Carnet(2, Civilite.MME, "Ullmann", "Liv", "1938-12-16", "0101010101", "1-16-5", "22", "Tokyo"),
//			new Carnet(3, Civilite.M, "Lynch", "David", "1946-01-20", "0202020202", "423 Fire Terrace", "59801",
//					"Missoula")));
//
//	@GetMapping("/carnets")
//	public ArrayList<Carnet> getAllRest() {
//		return this.listeCarnets;
//	}
//
//	@GetMapping("/carnetshtml")
//	/*
//	 * public String getAll(Model model) { model.addAttribute("liste",
//	 * listeCarnets); // ajoute la liste créer en ArrayList return"pages/carnets";
//	 * // retourne un string, mais on ne veut pas ca
//	 */
//
//	public ModelAndView getAll() { // pour envoyer vers une vue
//		ModelAndView mav = new ModelAndView("pages/carnets");
//		mav.addObject("carnets", listeCarnets);
//		return mav;
//
//	}
//
//	// @GetMapping , GetMapping et Request ici ,c'est exactement la meme chose
//	@RequestMapping(method = RequestMethod.GET, value = "/carnet/{id}")
//	public ModelAndView getById(@PathVariable Integer id) {
//		for (Carnet carnet : listeCarnets) {
//			if (id.equals(carnet.getId())) {
//				ModelAndView mav1 = new ModelAndView("pages/carnets");
//				mav1.addObject("carnets1", carnet);
//				return mav1;
//			}
//		}
//		return null;
//
//	}
//
//	@GetMapping("/carnetForm")
//	public ModelAndView getFormulaire() {
//		ModelAndView mav2 = new ModelAndView("pages/carnetForm");
//		return mav2;
//
//	}
//
//	@RequestMapping(method = RequestMethod.POST, value = "/carnetForm1") // ajout ds le carnet une personne
//	public ModelAndView ajout(@Validated Carnet carnet, BindingResult bindingResult /*@ModelAttribute Carnet carnet*/) {
//		if(bindingResult.hasErrors()) {
//		return new ModelAndView("pages/carnetForm.html").addObject("carnet",carnet);
//		}
//	
//		carnet.setId(listeCarnets.size()+1);
//		listeCarnets.add(carnet);
//	return new ModelAndView("pages/carnetFormResult.html").addObject("carnet", carnet);
//	}
//
//	@RequestMapping(value = "/carnet", method = RequestMethod.GET)
//	public ModelAndView form() {
//		return new ModelAndView("pages/carnetForm").addObject("carnet", new Carnet());
//
//	}
//
////	@RequestMapping(value ="/carnet/{id}")
////	public void delete(@PathVariable Long id) {
////		Iterator<Carnet> it = listeCarnets.iterator();
////		while(it.hasNext()) {
////			Carnet carnet = it.next();
////			if(carnet.getId().equals(id)) {
////				it.remove();
////			}
////		}
////	
////	
////	this.listeCarnets.removeIf(obj -> obj.getId().equals(id));
////	}

@Autowired
private CarnetServices cs;


@GetMapping("/carnets")
public List<Carnet> getAllCarnet() {
	return cs.getAllCarnets();
}


}
