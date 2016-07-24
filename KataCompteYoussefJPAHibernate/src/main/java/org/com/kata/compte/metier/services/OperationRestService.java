package org.com.kata.compte.metier.services;


import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

import java.util.List;

import org.com.kata.compte.entities.Compte;
import org.com.kata.compte.entities.Operation;
import org.com.kata.compte.metier.OperationMetier;
import org.com.kata.compte.utils.SwaggerMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Youssef CHAHID
 *
 */
@SwaggerDefinition(tags = {
		@Tag(name = SwaggerMessages.OPERATION_CONTROLLER_LIBELLE, description = SwaggerMessages.OPERATION_CONTROLLER_DESCRIPTION) })
@Api(value= SwaggerMessages.OPERATION_CONTROLLER_LIBELLE,description=SwaggerMessages.OPERATION_CONTROLLER_DESCRIPTION)
@RestController
@RequestMapping("/api/operations")
public class OperationRestService {
	
	@Autowired
	private OperationMetier operationMetier;

	
	@RequestMapping(value="{idClient}/comptes/{codeCompte}/versement/{montant}",method=RequestMethod.PUT)
	@Transactional
	public Compte versement(@PathVariable Long idClient,@PathVariable String codeCompte,@PathVariable double montant) {
		System.out.println(operationMetier);
		return operationMetier.versement(codeCompte, montant);
	}
	
	@RequestMapping(value="{idClient}/comptes/{codeCompte}/retrait/{montant}",method=RequestMethod.PUT)
	@Transactional
	public Compte retrait(@PathVariable Long idClient,@PathVariable String codeCompte,@PathVariable double montant) {
		return operationMetier.retrait(codeCompte, montant);
	}
	
	@RequestMapping(value="{code}",method=RequestMethod.GET)
	public List<Operation> getCompte(@PathVariable String code) {
		return operationMetier.getOperationByCodeCompte(code);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Operation> listOperation() {
		return operationMetier.listOperations();
	}
	
}
