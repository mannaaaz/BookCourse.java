package classes;

public class Course {

	// attributes 
	private int id; 
	private String name;
	
	// setters and getters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// constructor 
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	// toString 
	@Override
	public String toString() {
		return " "+getName()+"."; 
	} 
	
	
	
	
	
}
