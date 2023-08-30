package com.app.services;

import java.util.List;

import com.app.pojos.Admin;
import com.app.pojos.Buyer;
import com.app.pojos.Farmer;
import com.app.pojos.Order;
import com.app.pojos.Product;

public interface AdminService {
	
	List<Buyer> getAllBuyers();
	
	List<Farmer> getAllFarmers();
	
	List<Order> getAllOrders();
	
	List<Product> getAllProducts();
	
	Admin updateAdmin(Admin admin);
	
	Admin registerAdmin(Admin admin);
	
	void deleteFarmerById(long id);
	
	void deleteBuyerById(long id);
}
