package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "farmers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Farmer extends BaseEntity{
	
	@NotEmpty
	private String firstname;
	
	@NotEmpty
	private String lastname;
	
	@NotEmpty
	@Size(max=11, message = "Please Enter 10 digit mobile number")
	private String contact;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String address;
	
	@NotEmpty
	private String username;
	
//	@OneToMany(mappedBy = "fid" ,cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Product> prods = new ArrayList();
	
	
//	public void addProduct(Product p ) {
//		prods.add(p);
//		p.setFid(this);
//	}
}
