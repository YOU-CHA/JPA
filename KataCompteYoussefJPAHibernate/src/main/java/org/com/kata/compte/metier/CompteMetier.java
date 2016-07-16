package org.com.kata.compte.metier;

import java.util.Date;
import java.util.List;

import org.com.kata.compte.dao.CompteRepository;
import org.com.kata.compte.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Service
public class CompteMetier implements ICompteMetier {
	@Autowired
	private CompteRepository compteRepository;
	
	public Compte saveCompte(Compte cp) {
		// TODO Auto-generated method stub
		cp.setDateCreation(new Date());
		return compteRepository.save(cp);
	}

	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		return compteRepository.findOne(code);
	}
	
	public List<Compte> listComptes() {
		return compteRepository.findAll();
	}

	public Compte findCompteByCodeCompte(String codeCompte) {
		return compteRepository.findCompteByCodeCompte(codeCompte);
	}
	

}
