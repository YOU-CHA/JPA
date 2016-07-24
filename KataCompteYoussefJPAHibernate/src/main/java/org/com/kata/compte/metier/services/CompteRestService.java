package org.com.kata.compte.metier.services;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

import java.util.List;

import org.com.kata.compte.entities.Client;
import org.com.kata.compte.entities.Compte;
import org.com.kata.compte.metier.CompteMetier;
import org.com.kata.compte.utils.SwaggerMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Youssef CHAHID
 *
 */
@SwaggerDefinition(tags = {
		@Tag(name = SwaggerMessages.CLIENT_CONTROLLER_LIBELLE, description = SwaggerMessages.CLIENT_CONTROLLER_DESCRIPTION) })
@Api(value= SwaggerMessages.COMPTE_CONTROLLER_LIBELLE,description=SwaggerMessages.COMPTE_CONTROLLER_DESCRIPTION)
@RestController
@RequestMapping("/api/comptes")
public class CompteRestService {
	@Autowired
	private CompteMetier compteMetier;
	
	@ApiOperation(value = SwaggerMessages.COMPTE_CONTROLLER_GET_COMPTES_DESCRIPTION, response = Compte.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = SwaggerMessages.BAD_USER_ID),
			@ApiResponse(code = 401, message = SwaggerMessages.COMMON_ERROR_401),
			@ApiResponse(code = 403, message = SwaggerMessages.COMMON_ERROR_403),
			@ApiResponse(code = 404, message = SwaggerMessages.CONTROLLER_NOT_FOUND_ERROR_404),
			@ApiResponse(code = 500, message = SwaggerMessages.COMMON_ERROR_500) 
			})
	@RequestMapping(method=RequestMethod.GET)
	public List<Compte> listComptes() {
		return compteMetier.listComptes();
	}
	@ApiOperation(value = SwaggerMessages.COMPTE_CONTROLLER_POST_COMPTE_DESCRIPTION, response = Compte.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = SwaggerMessages.BAD_USER_ID),
			@ApiResponse(code = 401, message = SwaggerMessages.COMMON_ERROR_401),
			@ApiResponse(code = 403, message = SwaggerMessages.COMMON_ERROR_403),
			@ApiResponse(code = 404, message = SwaggerMessages.CONTROLLER_NOT_FOUND_ERROR_404),
			@ApiResponse(code = 500, message = SwaggerMessages.COMMON_ERROR_500) 
			})
	@RequestMapping(method=RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte cp) {
		return compteMetier.saveCompte(cp);
	}
	@ApiOperation(value = SwaggerMessages.COMPTE_CONTROLLER_GET_BY_ID, response = Compte.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = SwaggerMessages.BAD_USER_ID),
			@ApiResponse(code = 401, message = SwaggerMessages.COMMON_ERROR_401),
			@ApiResponse(code = 403, message = SwaggerMessages.COMMON_ERROR_403),
			@ApiResponse(code = 404, message = SwaggerMessages.CONTROLLER_NOT_FOUND_ERROR_404),
			@ApiResponse(code = 500, message = SwaggerMessages.COMMON_ERROR_500) 
			})
	@RequestMapping(value="{code}",method=RequestMethod.GET)
	public Compte getCompte(@PathVariable String code) {
		return compteMetier.getCompte(code);
	}
	

}
