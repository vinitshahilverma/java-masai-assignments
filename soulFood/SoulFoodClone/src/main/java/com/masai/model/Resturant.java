package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
public class Resturant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer resturantId;
	private String resturantName;
	
    @OneToOne(cascade = CascadeType.ALL)
	private Address address;
	private String mangaerName;
	private String contactNumber;
	
   
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Item> listItem = new ArrayList<>();
	
	
}
