package org.com.kata.compte.dao;


import org.com.kata.compte.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@Repository
public interface CompteRepository extends JpaRepository<Compte, String>{
	 Compte findCompteByCodeCompte(String codeCompte);
}
