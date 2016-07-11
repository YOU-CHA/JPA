package org.com.kata.compte.metier.services;

import java.util.List;

import org.com.kata.compte.entities.Compte;
import org.com.kata.compte.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@RestController
@RequestMapping("/api/comptes")
public class CompteRestService {
	@Autowired
	private CompteMetier compteMetier;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Compte> listComptes() {
		return compteMetier.listComptes();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte cp) {
		return compteMetier.saveCompte(cp);
	}

	@RequestMapping(value="{code}",method=RequestMethod.GET)
	public Compte getCompte(@PathVariable String code) {
		return compteMetier.getCompte(code);
	}
	

}
