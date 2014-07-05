package org.upiita.spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControlador {

	@RequestMapping(value="/login")
	public String login(){
		
		System.out.println("LOGIN ENTRANDO");
		
		return "login";
	}

}
