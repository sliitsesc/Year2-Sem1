package question4;

public class MyOwnAutoShop {

	public static void main(String[] args) {
	
		Vehicle truck = new Truck(250,"Red",150000.0,1800);
		Vehicle bus = new Bus(200,"Yellow",300000.0,"2009",15);
		
		truck.display();
		bus.display();
	}

}
