package com.masai.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderid;
	
	private LocalDate orderDate;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private FoodCart cart;
	
	private String orderStatus;

}
