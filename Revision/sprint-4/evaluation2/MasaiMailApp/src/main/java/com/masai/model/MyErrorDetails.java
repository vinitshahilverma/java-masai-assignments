package com.masai.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NegativeOrZero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyErrorDetails {
	
	private String message;
	private String Details;
	private LocalDateTime timeStamp;

}
