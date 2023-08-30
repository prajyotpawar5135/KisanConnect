package com.app.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Buyer;
import com.app.pojos.Product;
import com.app.repository.BuyerRepo;
import com.app.repository.ProductRepo;

@Service
@Transactional
public class BuyerServiceImpl implements BuyerService{
	
	@Autowired
	private BuyerRepo buyerRepo;
	
	@Autowired
	private ProductRepo prodRepo;
	
	@Override
	public List<Buyer> getAllBuyers() {
		// TODO Auto-generated method stub
		return buyerRepo.findAll();
	}

	@Override
	public Buyer registerBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		return buyerRepo.save(buyer);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

	@Override
	public String addOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
