package com.drcall.web.services;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TestSecurityController extends MultiActionController{

	static Logger log = Logger.getLogger(TestSecurityController.class);

	public void fetch(HttpServletRequest request, HttpServletResponse response) throws IOException {
		log.info("fetch");
		
		String abc = request.getParameter("abc");
		String def = request.getParameter("def");
		
		log.info("abd: "+abc);
		log.info("def: "+def);
	}
}
