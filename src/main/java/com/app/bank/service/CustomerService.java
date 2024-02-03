package com.app.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.entity.Customer;
import com.app.bank.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	public String saveCutomerDetails(Customer customer) {
		customerRepo.save(customer);
		return "Data Saved Successfully";
	}
}
