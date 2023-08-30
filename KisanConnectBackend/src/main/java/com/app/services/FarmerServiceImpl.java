package com.app.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.UserDto;
import com.app.exception.ResourceNotFoundException;
import com.app.pojos.Farmer;
import com.app.pojos.Order;
import com.app.pojos.Product;
import com.app.repository.FarmerRepo;
import com.app.repository.ProductRepo;

@Service
@Transactional
public class FarmerServiceImpl implements FarmerService {
	
	@Autowired
	private FarmerRepo farmerRepo;
	
	@Autowired
	private ProductRepo prodRepo;

	@Override
	public Farmer getFarmer(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Farmer> getAllFarmer(){
		return farmerRepo.findAll();
				
	}

	@Override
	public Farmer forgetPassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Farmer registerFarmer(Farmer farmer) {
		// TODO Auto-generated method stub
		return farmerRepo.save(farmer);
	}

	@Override
	public Farmer loginFarmer(UserDto request) {
		Farmer farmer =farmerRepo.findByUsernameAndPassword(request.getUsername(), request.getPassword()).orElseThrow(()-> new ResourceNotFoundException("Farmer not found"));
		return farmer;
	}
	@Override
	public String addProduct(Product product) {
		String s = "Product not added";
		
		//int i = product.getFid().getFid();
		
		prodRepo.save(product);
		return null;
	}
	@Override
	public String getOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
