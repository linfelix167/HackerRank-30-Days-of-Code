/**
 * Day 13 Abstract Classes
 * 
 * Given a Book class and a Solution class, write a MyBook class that does the following:

	*Inherits from Book
	*Has a parameterized constructor taking these 3 parameters:
		string title
		string author
		int price
 * Implements the Book class' abstract display() method so it prints these 3 lines:
		1. Title:, a space, and then the current instance's title.
		2. Author:, a space, and then the current instance's author.
		3. Price:, a space, and then the current instance's price.
 * 
 * @author Felix
 *
 */
public class MyBook extends Book{
  
	private String title;
	private String author;
  	private int price;
 
  	public MyBook(String t, String a, int p){
    super(t, a);
    this.title = t;
    this.author = a;
    this.price = p;
  	}

  	public void display(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
  }
}