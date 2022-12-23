package com.masai;

public class Cat extends Animal{
	
	String nickName;
	
	public Cat() {
		
	}
	
	public Cat(String nickName) {
		this.nickName = nickName;
	}

	public Cat(String name, String nickName) {
		super(name);
		this.nickName = nickName;
	}

	@Override
	public void makeNoise() {
		if(nickName==null) {
			System.out.println("Cat is meowing....");
		}
		else
		System.out.println(nickName+" Cat is meowing....");
	}

	@Override
	public void eat() {
		if(nickName==null) {
			System.out.println("Cat is Eating....");
		}
		else
		System.out.println(nickName+" Cat is Eating....");
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void jump() {
		if(nickName==null) {
			System.out.println("Cat is Jumping....");
		}
		else
		System.out.println(nickName+" Cat is jumping...");
	}

}
