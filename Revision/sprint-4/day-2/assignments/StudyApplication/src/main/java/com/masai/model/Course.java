package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Course {
	
	public Integer courseId;
	public String courseName;
	public String duration;
	public Double fee;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "courses")
	public List<Student> students = new ArrayList<>();

}
