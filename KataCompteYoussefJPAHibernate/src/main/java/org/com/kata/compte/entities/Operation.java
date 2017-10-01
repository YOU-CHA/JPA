package org.com.kata.compte.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * 
 * @author Youssef CHAHID
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OP",length=1)

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="TYPE_OP")
@JsonSubTypes({
	@Type(name="V",value=Versement.class),
	@Type(name="R",value=Retrait.class),
})

public class Operation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroOperation;
	private Date dateOperation;
	private double montantOperation;
	@ManyToOne
	@JoinColumn(name="CODE_CPTE")
	private Compte compte;
	public Long getNumeroOperation() {
		return numeroOperation;
	}

	public void setNumeroOperation(Long numeroOperation) {
		this.numeroOperation = numeroOperation;
	}
	@JsonIgnore // JSON
	@XmlTransient // JAX-B
	public Compte getCompte() {
		return compte;
	}
	@JsonSetter
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(Long numeroOperation, Date dateOperation, double montant) {
		super();
		this.numeroOperation = numeroOperation;
		this.dateOperation = dateOperation;
		this.montantOperation = montant;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montantOperation;
	}

	public void setMontant(double montant) {
		this.montantOperation = montant;
	}
	
	
	
}
