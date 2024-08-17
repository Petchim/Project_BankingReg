package com.example.demo.services;

import java.awt.SystemColor;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exepction.NotFoundException;
import com.example.demo.model.RegisterModel;
import com.example.demo.repo.RegisterRepo;

@Service
public class RegisterServices {

	@Autowired
	private RegisterRepo registerRepo; // Adjusted naming for clarity

	@Autowired
	private email emailServicesApi; // Adjusted naming for clarity

	public RegisterModel save(RegisterModel model) throws NotFoundException {

		RegisterModel existingModel = registerRepo.findByEmail(model.getEmail());

		if (existingModel != null) {
			
			// Generate a random 4-digit number and format it
			Random random = new Random();
			int randomNumber = random.nextInt(10000);
			String formattedNumber = String.format("%04d", randomNumber);
			model.setMemberid("MNUHF" + formattedNumber);

			// Send an email
			// emailServicesApi.sendEmail(model);
			return registerRepo.save(model);
			
		}else {
			
			throw new IllegalArgumentException("Email already exists");
		}

		
	}

	public List<RegisterModel> getdetails() {

		return registerRepo.findAll();
	}


    public RegisterModel update(RegisterModel model) throws NotFoundException {
     
        RegisterModel user = registerRepo.findById(model.getId()).orElse(null);
  
        if (user != null) {
            user.setName(model.getName());
            user.setAddress(model.getAddress());
            return registerRepo.save(user);
        } else
			throw new NotFoundException("No record found with id: " + model.getId());
    }
}
