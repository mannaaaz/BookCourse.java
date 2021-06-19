package appTest;

import classes.Book;
import classes.Course;
import classes.CourseBooks; 


public class CourseBooksTest {

	public static void main(String[] args) {
		
		
		Course c1 = new Course(1, "Programming Concepts"); 
		CourseBooks cb1 = new CourseBooks(c1); 
		Book b1 = new Book("C151", "C++ How to program", 100); 
		Book b2 = new Book("C251", "C How to program", 200); 
		Book b3 = new Book("C351", "C# How to program", 400); 
		Book b4 = new Book("P451", "Python How to program", 300); 
		cb1.addBook(b1);
		cb1.addBook(b2);
		cb1.addBook(b3);
		cb1.addBook(b4);
		
		
		Course c2 = new Course(2, "Object-Oriented Programming"); 
		CourseBooks cb2 = new CourseBooks(c2); 
		Book b5 = new Book("C110", "Basics of OOP   ", 350); 
		Book b6 = new Book("C200", "Advanced OOP     ", 250); 
		Book b7 = new Book("C330", "OOP-JAVA              ", 500); 
		Book b8 = new Book("C450", "JAVA Inter.     ", 650); 
		cb2.addBook(b5);
		cb2.addBook(b6);
		cb2.addBook(b7);
		cb2.addBook(b8);
		
		// displying on screen 
		System.out.println("Courses... \n");
		System.out.println(cb1.displyBook());
		System.out.println("The Book with highest price:\n" + cb1.getMaxPrice());
		System.out.println("=======================================");
		System.out.println(cb2.displyBook());
		System.out.println("The Book with highest price:\n" + cb2.getMaxPrice());
		System.out.println("=======================================");
	} // end of main 
    

} // end of test-class
