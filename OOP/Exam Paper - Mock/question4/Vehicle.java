package question4;

public abstract class Vehicle {
	int speed;
	double regularPrice;
	String colour;
	
	public Vehicle() {
		this.speed = 0;
		this.regularPrice = 0.0;
		this.colour=null;
	}
	
	public Vehicle(int speed, double price,String colour) {
		this.speed = speed;
		this.regularPrice = price;
		this.colour = colour;
	}
	
	public double getSalePrice() {
		return this.regularPrice;
	}
	
	public void display() {
		System.out.println("Speed  : "+this.speed);
		System.out.println("Colour : "+this.colour);
	}
	
}
