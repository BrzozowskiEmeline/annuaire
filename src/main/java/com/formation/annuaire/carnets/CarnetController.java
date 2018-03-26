package com.formation.annuaire.carnets;

import com.formation.annuaire.carnets.Civilite;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
public class CarnetController {

    List<Carnet> listeCarnets = new ArrayList<Carnet>(Arrays.asList(
            new Carnet(1, Civilite.MONSIEUR, "Besson", "Luc", "1959-13-18","0000000000", "5 avenue de l'Element", "75015", "Paris"),
            new Carnet(2, Civilite.MADAME, "Ullmann", "Liv", "1938-12-16","0101010101", "1-16-5", "22", "Tokyo"),
            new Carnet(3, Civilite.MONSIEUR, "Lynch", "David", "1946-01-20","0202020202", "423 Fire Terrace", "59801", "Missoula")
    ));

    @GetMapping("/carnets")
    public List<Carnet> getAllRest(Model model) {
        return listeCarnets;
    }

    @GetMapping("/carnetshtml")
    public ModelAndView getAll(){
        ModelAndView mav = new ModelAndView("pages/carnets");
        mav.addObject("carnets", listeCarnets);
        return mav;
    }

    @RequestMapping(value = "/carnet", method = RequestMethod.GET)
    public ModelAndView form(){
        return new ModelAndView("pages/carnetForm");
    }

    @RequestMapping(value = "/carnet", method = RequestMethod.POST)
    public void add(@ModelAttribute Carnet carnet){
        carnet.setId(listeCarnets.size() + 1);
        listeCarnets.add(carnet);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/carnet/{id}")
    public ModelAndView getById(@PathVariable Integer id){
        ModelAndView mav = new ModelAndView("pages/carnet");
        for ( Carnet carnet : listeCarnets){
            if (id.equals(carnet.getId())){
                mav.addObject("carnet", carnet);
                return mav;
            }
        }
        return null;
    }

    private ModelAndView modelAndView(String page, List<Object> tabVar){
        ModelAndView mav = new ModelAndView(page);
        for( Object str : tabVar){
            mav.addObject(str.toString(),str);
        }
        return mav;
    }
}
