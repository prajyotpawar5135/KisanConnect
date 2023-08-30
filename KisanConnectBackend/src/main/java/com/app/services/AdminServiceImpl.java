package com.app.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.pojos.Admin;
import com.app.pojos.Buyer;
import com.app.pojos.Farmer;
import com.app.pojos.Order;
import com.app.pojos.Product;
import com.app.repository.AdminRepo;
import com.app.repository.BuyerRepo;
import com.app.repository.FarmerRepo;
import com.app.repository.OrderRepo;
import com.app.repository.ProductRepo;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private FarmerRepo farmerRepo;
	
	@Autowired
	private BuyerRepo buyerRepo;
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Buyer> getAllBuyers() {
		
		return buyerRepo.findAll();
	}

	@Override
	public List<Farmer> getAllFarmers() {
		// TODO Auto-generated method stub
		return farmerRepo.findAll();
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public void deleteFarmerById(long id) {
		// TODO Auto-generated method stub
		 farmerRepo.deleteById(id);	
	}

	@Override
	public void deleteBuyerById(long id) {
		// TODO Auto-generated method stub
		buyerRepo.deleteById(id);
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.saveAndFlush(admin);
	}

	@Override
	public Admin registerAdmin( Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}
	
	
	
	
	
	
	
}
