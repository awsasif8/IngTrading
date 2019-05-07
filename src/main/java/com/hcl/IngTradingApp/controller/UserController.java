package com.hcl.IngTradingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.IngTradingApp.dto.UserDto;
import com.hcl.IngTradingApp.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<UserDto> users() {

		List<UserDto> response = userService.getUsersList();
		return  response;
	}
}
