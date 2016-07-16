package org.com.kata.compte.metier;

import org.com.kata.compte.entities.Compte;

/**
 * 
 * @author Youssef CHAHID
 *
 */
public interface IOperationMetier {
	public Compte versement(String codeCompte, double montant);
	public Compte retrait(String codeCompte, double montant);
}
