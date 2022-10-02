package com.question1;

public class Father {
	
	private String name;
	private int age;
	
	public Father() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Father [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

}
