package org.com.kata.compte.dao;


import java.util.List;

import org.com.kata.compte.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 * 
 * @author Youssef CHAHID
 *
 */
public interface OperationRepository extends JpaRepository<Operation, Long>{
	@Query("Select o from Operation o where o.compte.codeCompte=:x")
	public List<Operation> getOperationByCodeCompte(@Param("x") String codeCompte);
	
}
