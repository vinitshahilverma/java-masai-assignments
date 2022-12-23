package com.masai.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class FIR {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer firId;
	private String crimeDetails;
	private LocalDateTime timeStamp;
	private String policeStation;
    
	@OneToMany(cascade=CascadeType.ALL)
	private List<Criminal> crimnals = new ArrayList<>();

}
