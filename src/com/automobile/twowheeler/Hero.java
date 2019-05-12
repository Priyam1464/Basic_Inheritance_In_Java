/*Create a package called com.automobile. Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 

Create twowheeler subpackage under automobile package
Hero  class extends  automobile.vehicle class with the following methods
public int getSpeed() 
– returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device 

Honda class extends com.automobile.vehicle class with the following methods
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.

Create a test class to test the methods available in all these child class.*/

package com.automobile.twowheeler;

public class Hero extends com.automobile.Vehicle{
	public Hero(String model,String reg,String owner,int speed)
	{
		this.model=model;
		this.reg=reg;
		this.owner=owner;
		this.speed=speed;
	}
		public int getSpeed()
		{

		return speed;
	   }
	public void radio(){
		System.out.println("COntrol the radio device");
		}
	public  String getModelName()
	{
		return model;
	}
	public String getRegistrationNumber()
	{

		return reg;
	}
	public String getOwnerName(){

		return owner;
		}
}