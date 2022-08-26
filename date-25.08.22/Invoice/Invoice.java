package oops.pack;
//Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
//An Invoice should include four pieces of information as instance variables‐a part number(type String),a part
//description(type String),a quantity of the item being purchased (type int) and a price per item  (double). Your
//class should have a constructor that initializes the four instance variables. In addition, provide a method named getInvoice
//Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the
//quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a
//test application named InvoiceTest that demonstrates class Invoice’s capabilities.
public class Invoice {
String number;
String description;
int purchased_item;
double price_perItem;
Invoice(String number,String description,int purchased_item,double price_perItem){
	this.number = number;
	this.description = description;
	this.purchased_item = purchased_item;
	this.price_perItem = price_perItem;
	
	if(this.purchased_item<0) {
		this.purchased_item = 0;
	}
	if(this.price_perItem<0) {
		this.price_perItem = 0.0;
	}
}
	
	double amount() {
		double totalAmount = this.purchased_item * this.price_perItem;
		return totalAmount;
	}
	
}

