package com.qa.interfacesegregation;

public interface OrderService {
	
	void orderBurger(int quantity);

	void orderFries(int fries);

	void orderMeal(int quantity, int fries);
	
}