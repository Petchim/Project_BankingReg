package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.RegisterModel;
@Repository


public interface RegisterRepo extends JpaRepository<RegisterModel,Integer> {



	RegisterModel findByEmail(String email);

	




}