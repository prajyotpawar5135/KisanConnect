package com.app.services;

import java.util.List;

import com.app.pojos.Buyer;
import com.app.pojos.Product;

public interface BuyerService {
	
	List<Buyer> getAllBuyers();
	
	Buyer registerBuyer(Buyer buyer);
	
	List<Product> getAllProducts();
	
	String addOrder();
	
}
