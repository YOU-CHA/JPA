package org.com.kata.compte;

import java.util.Date;

import org.com.kata.compte.dao.OperationRepository;
import org.com.kata.compte.entities.Client;
import org.com.kata.compte.entities.Compte;
import org.com.kata.compte.entities.CompteCourant;
import org.com.kata.compte.entities.Operation;
import org.com.kata.compte.entities.Retrait;
import org.com.kata.compte.entities.Versement;
import org.com.kata.compte.metier.CompteMetier;
import org.com.kata.compte.metier.OperationMetier;
import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class OperationRestServiceTest {

	@InjectMocks
	private OperationMetier operationMetier;
	
	@Mock
	private OperationRepository operationRepository;
	
	@Mock
	private CompteMetier compteMetier;
	
	private Client client;
	private Compte compte;
	private Operation versement;
	private Operation retrait;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		client = new Client();
		compte = new CompteCourant("CC1", new Date(), 1000, 0);
		client.getComptes().add(compte);
		retrait = new Retrait();
		versement = new Versement();
		
	}
	@Test
	public void versementSuccessTest() {
		
		String codeCompte = "CC1";
		double montant = 2000;
		Mockito.when(compteMetier.findCompteByCodeCompte(codeCompte)).thenReturn(compte);
		Mockito.when(operationRepository.save(versement)).thenReturn(versement);
		Compte compte = operationMetier.versement(codeCompte, montant);
		Assertions.assertThat(compte.getSolde()).isEqualTo(3000);
	}
	@Test
	public void retraitSuccessTest() {
		
		String codeCompte = "CC1";
		double montant = 500;
		Mockito.when(compteMetier.findCompteByCodeCompte(codeCompte)).thenReturn(compte);
		Mockito.when(operationRepository.save(retrait)).thenReturn(retrait);
		Compte compte = operationMetier.retrait(codeCompte, montant);
		Assertions.assertThat(compte.getSolde()).isEqualTo(500);
	}
}
