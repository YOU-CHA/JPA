package org.com.kata.compte.metier.services;

import java.util.List;

import org.com.kata.compte.entities.Client;
import org.com.kata.compte.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@RestController
@RequestMapping("/api/clients")
public class ClientRestService {
	@Autowired
	private ClientMetier clientMetier;

	@RequestMapping(method=RequestMethod.POST)
	public Client saveClient(@RequestBody Client client) {
		return clientMetier.saveClient(client);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}
	
	
}
