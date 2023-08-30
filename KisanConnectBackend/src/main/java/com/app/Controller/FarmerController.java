package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Farmer;
import com.app.services.FarmerService;

@RestController
@RequestMapping("/farmer")
public class FarmerController {
	
	@Autowired
	private FarmerService farmerService;
	@PostMapping
	public Farmer registerFarmer(@RequestBody Farmer farmer) {
		return farmerService.registerFarmer(farmer);
	}
	
	@GetMapping
	public List<Farmer> getAllFarmers(){
		return farmerService.getAllFarmer();
	}
	
	
}
