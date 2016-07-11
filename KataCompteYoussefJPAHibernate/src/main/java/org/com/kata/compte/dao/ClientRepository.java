package org.com.kata.compte.dao;


import org.com.kata.compte.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author Youssef CHAHID
 *
 */
public interface ClientRepository extends JpaRepository<Client, Long>{

}
