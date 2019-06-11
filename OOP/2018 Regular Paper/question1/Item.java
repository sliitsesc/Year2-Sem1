package question1;

public abstract class Item {

	protected int itemNo;
	protected String description;
	protected double unitPrice;
	
	Item(int no,String des,double price){
		this.itemNo=no;
		this.description=des;
		this.unitPrice=price;
	}
	
	public void Display() {
		System.out.println("Item No : "+this.itemNo);
		System.out.println("Description : "+this.description);
		System.out.println("Unit Price : "+this.unitPrice);
	}
	
}
