package com.example.minilogin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.minilogin.DAO.UserDAO;
import com.example.minilogin.model.Users;


	
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	
	public class UserController {
		@Autowired
		private UserDAO userDAO;
		
		@GetMapping("/users")
		public List getUsers() {	
		return userDAO.viewAllUser();
	}

		
		@GetMapping("/users/{name}/{password}")
		public ResponseEntity getUserLogin(@PathVariable("name") String name,@PathVariable("password") String password) {		
			int flag=userDAO.loginValidation(name,password);			
			if (flag == 0) {
				return new ResponseEntity("No Customer found for ID " + name, HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity(flag, HttpStatus.OK);
		}
		
		@PostMapping("/users")
		public ResponseEntity createUser(@RequestBody Users user) {
			userDAO.createUser(user);
			System.out.println("hkajh");
			return new ResponseEntity(user, HttpStatus.OK);
		}

	}