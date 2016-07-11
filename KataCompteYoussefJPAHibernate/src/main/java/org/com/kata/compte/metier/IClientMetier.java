package org.com.kata.compte.metier;

import java.util.List;

import  org.com.kata.compte.entities.*;
/**
 * 
 * @author Youssef CHAHID
 *
 */
public interface IClientMetier {
	public Client saveClient(Client client);
	public List<Client> listClient();
	
}
