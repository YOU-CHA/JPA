package org.com.kata.compte.metier;

import java.util.List;

import org.com.kata.compte.dao.ClientRepository;
import org.com.kata.compte.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Service
public class ClientMetier implements IClientMetier {
	@Autowired
	private ClientRepository clientRepository;
	
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

	public List<Client> listClient() {
		return clientRepository.findAll();
	}
	public Client findClientById(Long idClient) {
		return clientRepository.findOne(idClient);
	}

}
