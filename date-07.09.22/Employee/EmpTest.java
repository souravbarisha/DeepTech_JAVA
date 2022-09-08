package com.unit.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpTest {


	
		EmployeeDetails e=new EmployeeDetails();
		EmpBusinessLogic eg=new EmpBusinessLogic();
		@Test
		void testAppraisal()
		{
			e.setName("rahul");
			e.setAge(26);
			e.setMonthlySalary(40000);
			double appraisal=eg.calculateAppraisal(e);
			assertEquals(1000,appraisal);
		}
		
		

	
	}


