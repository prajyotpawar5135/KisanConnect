package com.app.services;

import java.util.List;

import com.app.DTO.UserDto;
import com.app.pojos.Farmer;
import com.app.pojos.Order;
import com.app.pojos.Product;

public interface FarmerService {
	
	Farmer getFarmer(String userName);
	
	 List<Farmer> getAllFarmer();
	
	Farmer forgetPassword(String password);
	
	Farmer registerFarmer(Farmer farmer);
	
	Farmer loginFarmer(UserDto userd);
	
	String addProduct(Product product);
	
	String getOrder(Order order);
	
}
