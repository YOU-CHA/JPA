package org.com.kata.compte.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Entity
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	private String nomClient;
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
	private List<Compte> comptes = new ArrayList<Compte>();
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	@JsonIgnore // JSON
	@XmlTransient // JAX-B
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public Client() {
		super();
	}
	public Client(String nomClient) {
		super();
		this.nomClient = nomClient;
	}
	
	
}
