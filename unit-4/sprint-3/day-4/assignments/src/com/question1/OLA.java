package com.question1;

public class OLA {
    
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		  
		Car car = new Car();
		
	
		if(numberOfPassenger<=3) {
			 car = new HatchBack();
			 car.setNumberOfKms(numberOfKMs);
			 car.setNumberOfPassenger(numberOfPassenger);
		}
		else {
			 car = new Seden();
			 car.setNumberOfKms(numberOfKMs);
			 car.setNumberOfPassenger(numberOfPassenger);
		}
		return car;
		  
	}
	
	public int calculateBill(Car car) {
		 int totalFare = 0;
		if(car instanceof HatchBack) {
			HatchBack h1 = (HatchBack)car;
			totalFare =h1.farePerKm*car.getNumberOfKms();
		}
		else {
			Seden s1 = (Seden)car;
			totalFare =s1.farePerKm*car.getNumberOfKms();
		}
		return totalFare;
	}
}
