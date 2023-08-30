package com.app.services;

import com.app.pojos.BuyerCart;

public interface BuyerCartService {
	String addItemToCart(BuyerCart buyerCart);
	
	String removeFromCart(BuyerCart buyerCart);
}
