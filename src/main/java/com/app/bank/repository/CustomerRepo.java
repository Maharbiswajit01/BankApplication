package com.app.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bank.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
