package question2;

public class Ques2b {

}


abstract class MobilePhone{
	 String Model;
	 double price;
	
	abstract public void display();
}

class A10 extends MobilePhone{
	public A10() {
		Model = "A10";
		price = 100000.00;
	}

	@Override
	public void display() {
		System.out.println("Model : "+this.Model);
		System.out.println("Price : "+this.price);
	}
}

class X25 extends MobilePhone{
	public X25() {
		Model = "X25";
		price = 130000.00;
	}

	@Override
	public void display() {
		System.out.println("Model : "+this.Model);
		System.out.println("Price : "+this.price);
	}
}

class TPlus extends MobilePhone{
	public TPlus() {
		Model = "TPlus";
		price = 89000.00;
	}

	@Override
	public void display() {
		System.out.println("Model : "+this.Model);
		System.out.println("Price : "+this.price);
	}
}

abstract class TV{
		String Model;
		int size;
		
		abstract public void display();
}

class Gamma50 extends TV{
	
	public Gamma50() {
		Model = "Gamma50";
		size = 50;
	}

	@Override
	public void display() {
		System.out.println("Model :" +Model);
		System.out.println("Size :" +size);		
	}
	
}

class Alpha40 extends TV{
	
	public Alpha40() {
		Model = "Alpha40";
		size = 40;
	}

	@Override
	public void display() {
		System.out.println("Model :" +Model);
		System.out.println("Size :" +size);		
	}
	
}

class Theta65 extends TV{
	
	public Theta65() {
		Model = "Theta65";
		size = 65;
	}

	@Override
	public void display() {
		System.out.println("Model :" +Model);
		System.out.println("Size :" +size);		
	}
	
}

abstract class AbstractFactory{
	
	abstract public TV getTV(String type);
	abstract public MobilePhone getMobilePhone(String type);
}

class TVFactory extends AbstractFactory{

	@Override
	public TV getTV(String type) {
		if(type.equalsIgnoreCase("Alpha40")) {
			return new Alpha40();
			
		}
		else if(type.equalsIgnoreCase("Gamma50")) {
			return new Gamma50();

		}
		else if(type.equalsIgnoreCase("Theta65")){
			return new Theta65();
		}
		else 
			return null;
	}

	@Override
	public MobilePhone getMobilePhone(String type) {
		return null;
	}
	
}

class MobileFactory extends AbstractFactory{

	@Override
	public TV getTV(String type) {
		return null;
	}

	@Override
	public MobilePhone getMobilePhone(String type) {
		
		if(type.equalsIgnoreCase("A10")){
			return new A10();
		}
		else if(type.equalsIgnoreCase("X25")) {
			return new X25();
		}
		else if(type.equalsIgnoreCase("TPlus")) {
			return new TPlus();
		}
		else
			return null;
	}
	
}

class FactoryProducer{
	public static AbstractFactory getFactory(String type) {
	
		if(type.equalsIgnoreCase("TV")) {
			return new TVFactory();
		}
		else if(type.equalsIgnoreCase("Mobile")) {
			return new MobileFactory();
		}
		else
			return null;

	}
}


class FactoryDemo{
	
	public static void main(String[] args) {
		
		AbstractFactory tvFactory = FactoryProducer.getFactory("TV");
		AbstractFactory mobileFactory = FactoryProducer.getFactory("Mobile");
		
		MobilePhone phone =  mobileFactory.getMobilePhone("A10");
		TV tv = tvFactory.getTV("Gamma50");
		
		phone.display();
		tv.display();
		
		
		
	}
}