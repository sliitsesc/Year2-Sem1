package question1;

public class Book extends Item {

	private String Publisher;
	private String category;
	private int pages;
	
	Book(int no, String des, double price,String pub,String cat,int pages) {
		
		super(no, des, price);
		this.itemNo = no;
		this.Publisher = pub;
		this.category = cat;
		this.pages = pages;
	}
	
	@Override
	public void Display() {
		System.out.println("Item No : "+this.itemNo);
		System.out.println("Description : "+this.description);
		System.out.println("Unit Price : "+this.unitPrice);
		System.out.println("Publisher : "+this.Publisher);
		System.out.println("Category : "+this.category);
		System.out.println("Pages : "+this.pages);
	}
	

	
}
