package com.example.BootFirst.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.BootFirst.Service.UserService;

@RestController
@RequestMapping(value="/name",method=RequestMethod.GET)
public class UserControler {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/ok")
	public String getName() {
		return userService.getUser();
	}
}
