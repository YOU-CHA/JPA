package org.com.kata.compte.utils;

/**
 * Created by VRA (g585845) on 4/21/2016.
 */

/**
 * Custom messages for swagger UI (documentation for HTTP API) HTML tag can be
 * used
 * 
 * Error codes: In order to have a better screen display, we had "width:300%"
 * CSS attribute to the "Reason" HTML table column. It hides "Response Model"
 * and "Headers" columns, if you need to use them, please remove this CSS
 * attribute.
 * 
 * Internal documentation about Swagger and naming convention is available here
 * : https://confluence-mogl.build.sec.safran/x/t7sUBg
 **/
public class SwaggerMessages {
	/**
	 * INIT SWAGGER
	 */
	public static String API_TITLE = "API";
	public static String API_DESCRIPTION = "API HTTP du KATA-BANK";

	public static final String START_TAG = "<div style=\"width:300%;\">";
	public static final String END_TAG = "</div>";

	/**
	 * Errors
	 */
	// Common errors
	public static final String COMMON_ERROR_401 = "<p>La requête HTTPS n'a pas de certificat (aucune réponse JSON).</p>";
	public static final String COMMON_ERROR_403 = "<p>La requête HTTPS a un mauvais certificat (aucune réponse JSON).</p>";
	public static final String COMMON_ERROR_500 = "<p><b>INTERNAL_ERROR</b>: Une erreur interne est survenue.</p>";
	public static final String COMMON_CREATED_201 = "<p>La requête creation !!!!(aucune réponse JSON).</p>";

	// Specific shared errors
	public static final String BAD_JSON_PARAMETER = "<p><b>BAD_JSON_PARAMETER</b>: Impossible de décomposer le JSON.</p>";

	/**
	 * ****************************************************************** Class
	 * : ClientController 
	 * *******************************************************************
	 **/
	public static final String CLIENT_CONTROLLER_LIBELLE = "clients";
	public static final String CLIENT_CONTROLLER_DESCRIPTION = "EndPoint pour la gestion des Clients";
	public static final String CLIENT_CONTROLLER_GET_CLIENT_DESCRIPTION = "Listes clients";
	public static final String CLIENT_CONTROLLER_POST_CLIENT_DESCRIPTION = "Ajouter client";

	/**
	 * ****************************************************************** Class
	 * : CompteController 
	 * *******************************************************************
	 **/
	public static final String COMPTE_CONTROLLER_LIBELLE ="comptes";
	public static final String COMPTE_CONTROLLER_DESCRIPTION = "EndPoint pour la gestion des Comptes";
	public static final String COMPTE_CONTROLLER_GET_COMPTES_DESCRIPTION = "Listes comptes";
	public static final String COMPTE_CONTROLLER_POST_COMPTE_DESCRIPTION = "Ajouter compte";
	public static final String COMPTE_CONTROLLER_GET_BY_ID = "Chercher Compte par KEY";
	/**
	 * ****************************************************************** Class
	 * : CompteController 
	 * *******************************************************************
	 **/
	public static final String OPERATION_CONTROLLER_LIBELLE ="operations";
	public static final String OPERATION_CONTROLLER_DESCRIPTION = "EndPoint pour la gestion des Operations";
//	public static final String COMPTE_CONTROLLER_GET_COMPTES_DESCRIPTION = "Listes operations";
//	public static final String COMPTE_CONTROLLER_POST_COMPTE_DESCRIPTION = "Ajouter compte";
//	public static final String COMPTE_CONTROLLER_GET_BY_ID = "Chercher Compte par KEY";
	
	
	public static final String USER_NOT_FOUND = "<p><b>USER_NOT_FOUND</b>: Utilisateur non trouvé.</p>";
	public static final String BAD_INPUT_PARAMETER_CRITERIA = "<p><b>BAD_INPUT_PARAMETER</b>: Les paramètres de la requête sont incorrects.</p>";

	// Specific shared errors
	public static final String BAD_USER_ID = "<div style=\"width:300%;\"><p>L'identifiant de l'utilisateur est incorrect (mauvais format)</p></div>";
	public static final String BAD_USER_ID_OR_BAD_JSON = "<div style=\"width:300%;\"><p>L'identifiant de l'utilisateur est incorrect (mauvais format)</p><p><b>BAD_REQUEST</b>: Le paramÃ¨tre JSON est incorrect.</p></div>";

	/**
	 * ****************************************************************** Class
	 * : MonitoringController
	 * *******************************************************************
	 **/
	public static final String MONITORING_CONTROLLER_LIBELLE = "Monitoring";
	public static final String MONITORING_CONTROLLER_DESCRIPTION = "Monitoring technique et fonctionnel";

	public static final String MONITORING_CONTROLLER_TECHNICAL_CHECK_DESCRIPTION = "Monitoring technique de l'application";
	public static final String MONITORING_CONTROLLER_FUNCTIONNAL_CHECK_DESCRIPTION = "Monitoring fonctionnel de l'application";

	public static final String MESSAGE_CONTROLLER_LIBELLE = "Message";
	public static final String MESSAGE_CONTROLLER_DESCRIPTION = "Gestion des messages";

	public static final String MESSAGE_CONTROLLER_GET_MESSAGES = "Listes messages";
	public static final String CONTROLLER_NOT_FOUND_ERROR_404 = "<div style=\"width:300%;\"><p><b>MESSAGE_NOT_FOUND</b>: Aucun message trouvé.</p></div>";	
}
