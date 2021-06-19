package classes;

import java.util.ArrayList;
// DONE 
// Zain Manna 
public class CourseBooks{

	private Course course; // composition 
	private ArrayList<Book> books; // arraylist of books: composition 


	// setters and getters 
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public ArrayList<Book> getBooks() {
		return books; 
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	// constructor 
	public CourseBooks(Course course) {
		this.course = course;
		books= new ArrayList<Book>(); 
	}

	@Override
	public String toString() {
		return super.toString(); 
	}
	// methods needed 
	public void addBook (Book book) { 
		books.add(book); // adding one book to the arraylist of books 
	}

	public Book getMaxPrice() {
		double max= books.get(0).getPrice(); 
		Book bookMax = books.get(0); 
		for(Book b: books) {
			if(b.getPrice()>max) {
				max=b.getPrice(); 
				bookMax = b; 
			} // end of if 
		} // end of for 
		return bookMax; 
	} // end of method 
	
	public String displyBook() {
		String format = String.format("The Course:%s%nBooks..%nID\tTitle\t\t\tPrice\n",getCourse()); 
		for(Book b: books) {
			format+= b + "\n"; 
		} // end of for
		return format; 
	} // end of method 
}
