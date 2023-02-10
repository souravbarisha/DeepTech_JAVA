package com.BMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BMS.entity.Customer;
import com.BMS.service.BMS_Service;

@RestController
public class Control {
	@Autowired
	private BMS_Service bms_service;

//PostMapping for create customers details
	@PostMapping("/customers")
	public Customer createCustomerDetails(@RequestBody Customer customer) {
		return bms_service.createCustomer(customer);
	}

//GetMapping for get all customers details
	@GetMapping("/customers")
	public List<Customer> getAllCustomersDetails() {
		return bms_service.getAllCustomers();
	}

//GetMapping for get a single customer details
	@GetMapping("/customer/{ac}")
	public Customer getACustomerDetails(@PathVariable long ac) {
		return bms_service.getACustomer(ac);
	}

//PutMapping for update a customer details
	@PutMapping("/customer/{ac}")
	public Customer updateCustomerDetails(@RequestBody Customer acc) {
		return bms_service.updateCustomer(acc);
	}

//DeleteMapping for delete customer details
	@DeleteMapping("/customer/{ac}")
	public String deleteCustomerDetails(@PathVariable long ac) {
		return bms_service.deleteCustomer(ac);
	}
}
