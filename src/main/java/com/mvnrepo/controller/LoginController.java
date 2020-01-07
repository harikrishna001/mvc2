package com.mvnrepo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvnrepo.service.ILoginService;
@Controller
public class LoginController {
	@Autowired
	private  ILoginService   service;
	
	@RequestMapping(value="/LoginPage")
	public   ModelAndView   getLoginPage() {
		return  new  ModelAndView("login");		
	}
	
	@RequestMapping(value="/Verify", method=RequestMethod.POST)
	public   ModelAndView   verifyLogin(@RequestParam String username,@RequestParam String password) {
		boolean  flag = service.verifyUser(username, password);
		if(flag==true) {
			return  new  ModelAndView("success");
		}
		else {
			return  new  ModelAndView("failure");
		}
		
	}
}
