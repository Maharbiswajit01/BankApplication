package com.app.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.bank.entity.Customer;
import com.app.bank.repository.CustomerRepo;
import com.app.bank.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CustomerRepo customerRepo;

	@PostMapping("/saveCustomer")
	public Customer customerSave(@RequestBody Customer customer) {
		customerRepo.save(customer);
		return customer;
	}
}
