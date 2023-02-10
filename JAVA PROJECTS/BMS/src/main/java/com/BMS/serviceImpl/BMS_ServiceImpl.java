package com.BMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BMS.dao.Dao;
import com.BMS.entity.Customer;
import com.BMS.service.BMS_Service;

@Service
public class BMS_ServiceImpl implements BMS_Service {
	@Autowired
	private Dao dao;

//create customers details
	@Override
	public Customer createCustomer(Customer customer) {
		return dao.save(customer);
	}

//get all customers details
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

//get a single customer details
	@Override
	public Customer getACustomer(long ac) {
		// TODO Auto-generated method stub
		return dao.findById(ac).get();
	}

//update a customer details
	@Override
	public Customer updateCustomer(Customer acc) {
		// TODO Auto-generated method stub
		return dao.save(acc);
	}

//delete customer details
	@Override
	public String deleteCustomer(long ac) {
		// TODO Auto-generated method stub
		dao.deleteById(ac);
		return "The customer with AC NO. " + ac + " has been deleted";
	}

}
