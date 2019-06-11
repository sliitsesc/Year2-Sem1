package question4;

public class Oven {

	private String name;
	
	public Oven(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(name+" Oven is On. ");
	}
	
	public void off() {
		System.out.println(name+" Oven is Off. ");
	}
	
}
