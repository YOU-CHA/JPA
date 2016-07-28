package org.com.kata.compte.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Entity
@DiscriminatorValue("CC")


@XmlType(name="CC")
public class CompteCourant extends Compte{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert;

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(String codeCompte, Date dateCreation, double solde,
			double decouvert) {
		super(codeCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	

}
