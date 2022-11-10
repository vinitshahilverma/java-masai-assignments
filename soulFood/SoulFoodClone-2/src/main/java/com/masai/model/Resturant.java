package com.masai.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resturant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer resturantId;
	private String resturantName;
	private String mangaerName;
	private String contactNumber;

}
