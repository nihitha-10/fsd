package com.klh;
class Vehicle{
	void getVeh(){
		System.out.println("Vehicle moving : ");
	}
}
class Car extends Vehicle{
	void getVeh() {
		System.out.println("Car....");
	}
}
class ElectricCar extends Car{
	void getVeh(){
		System.out.println("Electric Car...");
	}
}
 
public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car();
		Vehicle v2 = new ElectricCar();
		v1.getVeh();
		v2.getVeh();

	}

}
