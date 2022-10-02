package com.question4;

public class Car {
      
    String model;
    String companyName;
    String color;
	Engine engine = new Engine();
	
	
	Car(){
			
	}
	
	Car(String model,String companyName,String color,int rpm,int power,String manufacturer){
		
		this.model =model;
		this.companyName = companyName;
		this.color = color;
		engine.rpm = rpm;
		engine.power = power;
		engine.manufacturer = manufacturer;

	}
	
	public void showDetails(){
		
		System.out.println("Car Model : "+model);
		System.out.println("Car companyName : "+companyName);
		System.out.println("Car color : "+color);
		System.out.println("Car rpm : "+ engine.rpm);
		System.out.println("Car power : "+engine.power);
		System.out.println("Car Engine Manufacturer : "+engine.manufacturer);
		engine.turbo(true);
	}
}
