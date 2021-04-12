package com.pro.threeb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * String viewName = (String)request.getAttribute("viewName");
		 * System.out.println("viewName : " + viewName); ModelAndView mav = new
		 * ModelAndView(viewName);
		 */
		return "main";
	}
	
}
