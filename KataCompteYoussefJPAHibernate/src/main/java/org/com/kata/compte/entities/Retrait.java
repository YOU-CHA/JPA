package org.com.kata.compte.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
