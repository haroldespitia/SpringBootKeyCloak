package com.tutorials.haroldsep.SpringBootKeyCloak.controllers;

import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Teams Controller class
 * 
 * @author haespitia
 *
 */
@Controller
public class TeamsController {

	/**
	 * Method that build a teams list and returned the same to the main page
	 * 
	 * @param model
	 * @return list of teams
	 */
	@GetMapping(path = "/teams")
	public String getItems(Model model) {
		model.addAttribute("teams", Arrays.asList("AC Milan", "Liverpool", "Real Madrid", "Bayer Münich"));
		return "teams";
	}

	/**
	 * Method to logout of the application and get back to the main page
	 * 
	 * @param request
	 * @return root path
	 * @throws ServletException
	 */
	@GetMapping(path = "logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}
