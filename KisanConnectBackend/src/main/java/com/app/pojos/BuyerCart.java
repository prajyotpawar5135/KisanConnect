package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "buyercart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuyerCart extends BaseEntity{
	
	@NotEmpty
	private String buyerusername;
	
	@NotEmpty
	private String crop;
	
	@NotEmpty
	private double quantity;
	
	@NotEmpty
	private double expectedprice;
	
	@NotEmpty
	private String farmername;
	
}
