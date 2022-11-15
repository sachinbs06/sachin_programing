package javacode;
//hierarchical inheritance

public class Vehicle {
	String brand="ducati";
}
class Car extends Vehicle{
	String colour="black";
	void start() {
		System.out.println("travelling in car is saffer than bike");
	}
}
class Bike extends Vehicle{
	int cost=453628;
	void stop() {
		System.out.println("bike driving is a fun");
	}
}
class solution2 {
	public static void main(String[] args) {
		Vehicle a= new Vehicle();
		System.out.println("vehicale brand is:"+a.brand);
		Car b=new Car();
		System.out.println("car colour is :"+b.colour+"brand is"+b.brand);
		b.start();
		Bike c=new Bike();
		System.out.println("cost of bike is"+c.cost+"brand is:"+c.brand);
		c.stop();
		
		}
}
