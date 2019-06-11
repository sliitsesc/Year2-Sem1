package question4;

public class Bus extends Vehicle {
	String year;
	double manufacturerDiscount;
	
	
	public Bus(int speed,String colour,double price,String year, double manufacturerDiscount) {
		super(speed,price,colour);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	
	public double getSalePrice(){
		double price = (this.regularPrice * (100-this.manufacturerDiscount) )/100.0;
		
		return price;
	}
	
	public void display() {
		System.out.println("**********Bus*********");
		System.out.println("Speed  : "+this.speed);
		System.out.println("Sale Price: "+this.getSalePrice());
		System.out.println("Colour : "+this.colour);
		System.out.println("Year : "+this.year);
	}
	
}