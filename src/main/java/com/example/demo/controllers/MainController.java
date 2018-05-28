package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.UserDao;
import com.example.demo.models.User;

@RestController
public class MainController {
	
	@Autowired
	private UserDao _userDao;
	
	@RequestMapping(value="/user")
	 public String getById(@RequestParam(value="id", defaultValue="5")String id) {
	    String userId;
	    try {
	      User user = _userDao.getById(Long.parseLong(id));
	      
	      System.out.println(user.toString());
	    }
	    catch(Exception ex) {
	      return "User not found";
	    }
	    return "The user id is: " + id;
	  }
	
}
