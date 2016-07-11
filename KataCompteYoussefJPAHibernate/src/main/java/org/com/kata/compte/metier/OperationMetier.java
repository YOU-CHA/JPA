package org.com.kata.compte.metier;

import java.util.Date;
import java.util.List;

import org.com.kata.compte.dao.CompteRepository;
import org.com.kata.compte.dao.OperationRepository;
import org.com.kata.compte.entities.Compte;
import org.com.kata.compte.entities.Operation;
import org.com.kata.compte.entities.Retrait;
import org.com.kata.compte.entities.Versement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Service
public class OperationMetier implements IOperationMetier {
	
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	
	public boolean versement(String codeCompte, double montant) {
		Compte cp  = compteRepository.findOne(codeCompte);
		Operation op = new Versement();
		op.setDateOperation(new Date());
		op.setMontant(montant);
		op.setCompte(cp);
		
		operationRepository.save(op);
		
		cp.setSolde(cp.getSolde()+montant);
		
		return true;
	}
	public boolean retrait(String codeCompte, double montant) {
		Compte cp  = compteRepository.findOne(codeCompte);
		
		if (cp.getSolde()<montant) throw new RuntimeException("Solde insufisant");
		
		Operation op = new Retrait();
		op.setDateOperation(new Date());
		op.setMontant(montant);
		op.setCompte(cp);
		
		operationRepository.save(op);
		
		cp.setSolde(cp.getSolde()-montant);
		
		return true;
	}
	
	public List<Operation> getOperationByCodeCompte(String codeCompte) {
		return operationRepository.getOperationByCodeCompte(codeCompte);
	}
	
	public List<Operation> listOperations() {
		return operationRepository.findAll();
	}
	
	
	
	

}
