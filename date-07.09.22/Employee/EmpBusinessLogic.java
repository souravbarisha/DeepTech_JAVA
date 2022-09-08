package com.unit.project1;

public class EmpBusinessLogic {
	public double calculateYearlySal(EmployeeDetails emp) {
		double yearlySal=0;
		yearlySal=emp.getMonthlySalary()*12;
		return yearlySal;
	}

	public double calculateAppraisal(EmployeeDetails emp ) {
		double appraisal=0;
		if(emp.getMonthlySalary()<10000) {
			appraisal=500;
		}else {
			appraisal=1000;
		}
		return appraisal;
	}
	}

