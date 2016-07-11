package org.com.kata.compte.dao;


import org.com.kata.compte.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author Youssef CHAHID
 *
 */
public interface CompteRepository extends JpaRepository<Compte, String>{

}
