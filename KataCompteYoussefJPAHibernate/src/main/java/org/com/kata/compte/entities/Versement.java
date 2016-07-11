package org.com.kata.compte.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
