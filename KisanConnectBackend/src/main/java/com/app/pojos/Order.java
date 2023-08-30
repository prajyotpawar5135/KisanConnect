package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseEntity{
	
	@ManyToOne
	@JoinColumn
	private Farmer fid;
	
	@NotEmpty
	private String crop_category;
	
	@NotEmpty
	private double quantity;
	
	@NotEmpty
	private double totalamount;
	
	@NotEmpty
	private String status;
	
	@ManyToOne
	@JoinColumn
	private Buyer bid;
}
