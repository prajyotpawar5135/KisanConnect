package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Buyer;
import com.app.pojos.Product;
import com.app.services.BuyerService;

@RestController
@RequestMapping("/buyer")
public class BuyerController {
	
	@Autowired
	private BuyerService buyerSer;
	
	@GetMapping
	public List<Buyer> getAllBuyers(){
		return buyerSer.getAllBuyers();
	}
	
	@PostMapping
	public Buyer registerBuyers(@RequestBody Buyer buyer) {
		return buyerSer.registerBuyer(buyer);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProds(){
		return buyerSer.getAllProducts();
	}
	
	
	
}
