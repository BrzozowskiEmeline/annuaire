package com.example.demo.carnet;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CarnetController {
	ArrayList<Carnet> listeCarnets = new ArrayList<Carnet>(Arrays.asList(

			new Carnet(1, Civilite.M, "Besson", "Luc", "1959-13-18", "0000000000", "5 avenue de l'Element", "75015",
					"Paris"),
			new Carnet(2, Civilite.MME, "Ullmann", "Liv", "1938-12-16", "0101010101", "1-16-5", "22", "Tokyo"),
			new Carnet(3, Civilite.M, "Lynch", "David", "1946-01-20", "0202020202", "423 Fire Terrace", "59801",
					"Missoula")));

	
	
	@GetMapping("/carnets")
	public ArrayList<Carnet> getAllRest() {
		return this.listeCarnets;
	}
	

	@GetMapping("/carnetshtml")
	/*public String getAll(Model model) {
		model.addAttribute("liste", listeCarnets); // ajoute la liste créer en ArrayList
		 return"pages/carnets"; // retourne un string, mais on ne veut pas ca*/
	
	public ModelAndView getAll() { // pour envoyer vers une vue
		ModelAndView mav = new ModelAndView ("pages/carnets");
		mav.addObject("carnets",listeCarnets);
		return mav;
// commentaire , une deuxième fois
	}
	
	//@GetMapping , GetMapping et Request ici ,c'est exactement la meme chose
	@RequestMapping(method=RequestMethod.GET,value="/carnet/{id}")
	public ModelAndView getById (@PathVariable Integer id) {
		for( Carnet carnet : listeCarnets){
			if(id.equals(carnet.getId())) {
				ModelAndView mav1 = new ModelAndView ("pages/carnets");
				mav1.addObject("carnets1",carnet);
				return mav1;
			}
		}
		return null;
		
	}

	@GetMapping("/carnetForm")	
	public ModelAndView getFormulaire(){
		ModelAndView mav2 = new ModelAndView ("pages/carnetForm");
		return mav2;

	}
	
	@RequestMapping(method=RequestMethod.POST,value="/carnetForm")	// ajout ds le carnet une personne
	public void  ajout(@ModelAttribute Carnet carnet){
	        carnet.setId(listeCarnets.size() + 1);
	        listeCarnets.add(carnet);
	}
	
	
	

}
