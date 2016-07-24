package org.com.kata.compte.metier.services;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

import java.util.List;

import org.com.kata.compte.entities.Client;
import org.com.kata.compte.metier.ClientMetier;
import org.com.kata.compte.utils.SwaggerMessages;
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
@SwaggerDefinition(tags = {
		@Tag(name = SwaggerMessages.CLIENT_CONTROLLER_LIBELLE, description = SwaggerMessages.CLIENT_CONTROLLER_DESCRIPTION) })
@Api(value= SwaggerMessages.CLIENT_CONTROLLER_LIBELLE,description=SwaggerMessages.CLIENT_CONTROLLER_DESCRIPTION)
@RestController
@RequestMapping("clients")
public class ClientRestService {
	@Autowired
	private ClientMetier clientMetier;

	@ApiOperation(value = SwaggerMessages.CLIENT_CONTROLLER_POST_CLIENT_DESCRIPTION, response = Client.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = SwaggerMessages.BAD_USER_ID),
			@ApiResponse(code = 401, message = SwaggerMessages.COMMON_ERROR_401),
			@ApiResponse(code = 403, message = SwaggerMessages.COMMON_ERROR_403),
			@ApiResponse(code = 404, message = SwaggerMessages.CONTROLLER_NOT_FOUND_ERROR_404),
			@ApiResponse(code = 201, message = SwaggerMessages.COMMON_CREATED_201),
			@ApiResponse(code = 500, message = SwaggerMessages.COMMON_ERROR_500) 
			})
	@RequestMapping(method=RequestMethod.POST)
	public Client saveClient(@RequestBody Client client) {
		return clientMetier.saveClient(client);
	}
	
	@ApiOperation(value = SwaggerMessages.CLIENT_CONTROLLER_GET_CLIENT_DESCRIPTION, response = Client.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = SwaggerMessages.BAD_USER_ID),
			@ApiResponse(code = 401, message = SwaggerMessages.COMMON_ERROR_401),
			@ApiResponse(code = 403, message = SwaggerMessages.COMMON_ERROR_403),
			@ApiResponse(code = 404, message = SwaggerMessages.CONTROLLER_NOT_FOUND_ERROR_404),
			@ApiResponse(code = 500, message = SwaggerMessages.COMMON_ERROR_500) 
			})
	@RequestMapping(method=RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}
	
	
}
