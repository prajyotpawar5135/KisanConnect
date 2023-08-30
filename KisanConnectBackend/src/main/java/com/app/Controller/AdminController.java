package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Admin;
import com.app.pojos.Buyer;
import com.app.pojos.Farmer;
import com.app.pojos.Product;
import com.app.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminSer;
	
	@GetMapping("/farmers")
	public List<Farmer> getAllFarmers(){
		return adminSer.getAllFarmers();
	}
	
	@GetMapping("/buyers")
	public List<Buyer> getAllBuyer(){
		return adminSer.getAllBuyers();
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return adminSer.getAllProducts();
	}
	
	@PostMapping
	public Admin registerAdmin(@RequestBody Admin admin) {
		return adminSer.registerAdmin(admin);
	}
	@PutMapping
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminSer.updateAdmin(admin);
	}
	
	@DeleteMapping("/farmer")
	public void deleteFarmer(int id) {
		adminSer.deleteFarmerById(id);
		System.out.println("Farmer deleted");
	}
	
	@DeleteMapping("/buyer")
	public void deleteBuyer(int id) {
		adminSer.deleteBuyerById(id);
		System.out.println("Buyer deleted");
	}
	
}
