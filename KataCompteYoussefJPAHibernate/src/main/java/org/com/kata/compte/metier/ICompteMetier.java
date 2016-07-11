package org.com.kata.compte.metier;

import org.com.kata.compte.entities.Compte;
/**
 * 
 * @author Youssef CHAHID
 *
 */
public interface ICompteMetier {
	public Compte saveCompte(Compte cp);
	public Compte getCompte(String code);
}
