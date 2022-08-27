package oops.pack;

public class Employee {
	String PanNo;
	String Name;
	int Annual_taxable_income;
	Employee(String PanNo,String Name,int Annual_taxable_income){
		this.PanNo = PanNo;
		this.Name = Name;
		this.Annual_taxable_income = Annual_taxable_income;
		
		
	}
	
	float calculateTax() {
		float tax=0;
		if(this.Annual_taxable_income <=100000) {
			return tax = 0;
		}
		 else if(this.Annual_taxable_income>=100001 && this.Annual_taxable_income<=150000) {
			return tax = (this.Annual_taxable_income-100001)*10/100;
		}
		 else if(this.Annual_taxable_income>=150001 && this.Annual_taxable_income<=250000) {
			 return tax = 5000+(this.Annual_taxable_income - 150001)*20/100;
		 }
		 else {
			 return tax = 25000 + (this.Annual_taxable_income -250001)*30/100;
		 }
		
	}
}
