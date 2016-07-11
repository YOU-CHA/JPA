package org.com.kata.compte.metier;

/**
 * 
 * @author Youssef CHAHID
 *
 */
public interface IOperationMetier {
	public boolean versement(String codeCompte, double montant);
	public boolean retrait(String codeCompte, double montant);
}
