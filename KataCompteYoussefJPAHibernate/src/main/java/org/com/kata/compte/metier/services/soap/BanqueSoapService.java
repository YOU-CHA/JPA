package org.com.kata.compte.metier.services.soap;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.com.kata.compte.entities.Compte;
import org.com.kata.compte.metier.CompteMetier;
import org.com.kata.compte.metier.OperationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService
public class BanqueSoapService {
	@Autowired
	private CompteMetier compteMetier;
	@Autowired
	private OperationMetier operationMetier;
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code")  String code) {
		return compteMetier.getCompte(code);
	}
	@WebMethod
	public Compte retrait(@WebParam(name="code") String codeCompte,@WebParam(name="montan") double montant) {
		return operationMetier.retrait(codeCompte, montant);
	}
	@WebMethod
	public Compte versement(@WebParam(name="code") String codeCompte,@WebParam(name="montan") double montant) {
		return operationMetier.versement(codeCompte, montant);
	}
	
}
