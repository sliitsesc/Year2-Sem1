package question4;

public class GarageGate {

	private String description;
	
	public GarageGate(String description) {
		this.description = description;
	}
	
	public void Open() {
		System.out.println(description+" Gate Is Open. ");
	}
	
	public void Close() {
		System.out.println(description+" Gate Is Closed. ");
	}
	
	
}
