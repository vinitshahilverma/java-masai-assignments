package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer postId;
	
	@Size(min = 2,message="title length must be greater than or equal to 2")
	private String tittle;
	
	@Size(min = 10,message="Description length must be greater than or equal to 10")
	private String descprtion;

	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<>();

}
