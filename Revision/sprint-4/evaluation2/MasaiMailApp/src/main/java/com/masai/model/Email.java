package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Email {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mailId;
	private LocalDateTime sendTime;
	private LocalDateTime recieveTime;
	private String discritption;
	
}
