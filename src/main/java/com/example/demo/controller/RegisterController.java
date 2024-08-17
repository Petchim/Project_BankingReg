package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exepction.NotFoundException;
import com.example.demo.model.RegisterModel;
import com.example.demo.services.RegisterServices;

@RestController



public class RegisterController {
	
	@Autowired 
	private RegisterServices  RegisterServicesApi;
	 
	@CrossOrigin("*")
	@PostMapping("/registerpage")
	
public RegisterModel register (@RequestBody RegisterModel model) throws NotFoundException {
		System.out.println(model.getName());
		return RegisterServicesApi.save(model);
	}

	@CrossOrigin("*")
	@GetMapping("/view")
	public List<RegisterModel>getdetails(){
		return RegisterServicesApi.getdetails();
		
	}
	
	@PutMapping("/update")
    public RegisterModel update(@RequestBody RegisterModel model) throws NotFoundException {

            RegisterModel updatedModel = RegisterServicesApi.update(model);
			return updatedModel;
         
    }
	
	
}