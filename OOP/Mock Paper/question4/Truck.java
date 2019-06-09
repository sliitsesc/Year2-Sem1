package question4;

public class Truck extends Vehicle {

	double weight;

	public Truck(int speed,String colour,double price,double weight) {
		super(speed,price,colour);
		this.weight = weight;
	}
	
	public double getSalePrice() {
		if(this.weight > 2000) {
			return this.regularPrice * 0.9;
		}
		else {
			return this.regularPrice * 0.8;
		}
	}

	public void display() {
		System.out.println("**********Truck*********");
		System.out.println("Speed  : "+this.speed);
		System.out.println("Sale Price: "+this.getSalePrice());
		System.out.println("Colour : "+this.colour);
		System.out.println("Weight : "+this.weight);
	}
	
	
}
