package classes;

public class Book{

	// attributes 
	private String code; 
	private String title; 
	private double price;
	
	// setters and getters 
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	// constructor 
	public Book(String code, String title, double price) {
		super();
		this.code = code;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return getCode() + "\t" + getTitle() + "\t" + getPrice()+ "\n"; 
	} 
	
	// toString 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
