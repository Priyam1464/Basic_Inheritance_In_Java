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

import com.automobile.Honda;
import com.automobile.Vehicle;
import com.automobile.twowheeler.Hero;
class Progr6{
	public static void main(String[] args){
	Hero hero = new Hero("Glamour 125","Bob Biswas","WB16G1234",23);
		System.out.println("Model is "+hero.getModelName());
		System.out.println("Owner is "+hero.getOwnerName());
		System.out.println("reg no is "+hero.getRegistrationNumber());
		System.out.println("Speed is "+hero.getSpeed());
		hero.radio();
		System.out.println();
		Honda honda = new Honda("Honda City","Prodosh Mitra","WB18G7777",110);
		System.out.println("Model is "+honda.getModelName());
		System.out.println("Owner is "+honda.getOwnerName());
		System.out.println("reg no is "+honda.getRegistrationNumber());
		System.out.println("Speed is "+honda.getSpeed());
		honda.cdplayer();

	}

}
		