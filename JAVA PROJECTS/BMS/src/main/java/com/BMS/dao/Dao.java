package com.BMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BMS.entity.Customer;

public interface Dao extends JpaRepository<Customer, Long> {

}
