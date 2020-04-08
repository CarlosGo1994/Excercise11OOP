package com.exercise11oop.model;

public class Angora extends Cat {
	
	//Propeties
	private int mouthLong;
	
	//Constructors
	public Angora()
	{
		
	}
	
	public Angora(int id, String name, int age)
	{
		super(id,name,age);
	}
	
	//Getters y setter
	public double getMouthLong()
	{
		return mouthLong;
	}
	public void setMouthLong(double mouthLong)
	{
		this.mouthLong = mouthLong;
	}

	@Override
	public void Meow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Scratch() {
		// TODO Auto-generated method stub
		
	}
	
	//T
}
