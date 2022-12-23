package com.masai;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Dog();

		animal.eat();
		animal.sleep();
		animal.makeNoise();

		Dog dog = (Dog) animal;

		dog.play();
		

		System.out.println("====================");

		Animal animal1 = new Dog("Husky");

		animal1.eat();
		animal1.sleep();
		animal1.makeNoise();

		Dog dog1 = (Dog) animal1;

		dog1.play();
		

		System.out.println("====================");

		Animal animal2 = new Dog("Husky", "Simba");
		
		animal2.eat();
		animal2.sleep();
		animal2.makeNoise();
		
		Dog dog3 = (Dog) animal2;
		
		dog3.play();
		
		
		System.out.println("=============Cat============");
		
		Animal animal4 = new  Cat();
		
		animal4.eat();
		animal4.sleep();
		animal4.makeNoise();

        Cat cat = (Cat)animal4;
        
        cat.jump();
       
        
        System.out.println("====================");
        
        Animal animal5 = new Cat("Meow");
        
        animal5.eat();
		animal5.sleep();
		animal5.makeNoise();

        Cat cat1 = (Cat)animal5;
        
        cat1.jump();
        
        System.out.println("====================");
        
        Animal animal6 = new Cat("Meow","Mithi");
        
        animal6.eat();
		animal6.sleep();
		animal6.makeNoise();
		
		Cat cat2 = (Cat)animal6;
		
		cat2.jump();
        
	}

}
