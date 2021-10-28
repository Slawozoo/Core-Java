package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//import com.ooptask.Article;

class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	int quantity;

	
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

public class LinkedList2 {
	public static void main(String[] args) {
		List<Book> list = new LinkedList<Book>();
		
		//Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    
//	    System.out.println("Enter variables of book class:  ");
	    Scanner sc = new Scanner(System.in);
//	    //Book books = new Book();
//	    int n = sc.nextInt();
//	    
//	    //Converting ArrayList to Array  
//	    Book[] array = list.toArray(new Book[list.size()]);    
//	    
//	    for(int i = 0; i < n  ; i++) {
//			
//			System.out.print("Id : ");
//			array[i].setId(sc.nextInt());
//			System.out.print("\nName: ");
//			array[i].setName(sc.next());
//			System.out.print("\nAuthor: ");
//			array[i].setAuthor(sc.next());
//			System.out.print("\nPublisher: ");
//			array[i].setPublisher(sc.next());
//			System.out.println("\nQuantity: ");
//			array[i].setQuantity(sc.nextInt());
//	    
//			System.out.println(array[i]);
//	    }
//	    
	    
	    //USer input for one class
	    System.out.print("Id : ");
	    int id = sc.nextInt();
	    System.out.print("\nName: ");
	    String name = sc.next();
	    System.out.print("\nAuthor: ");
	    String author = sc.next();
	    System.out.print("\nPublisher: ");
	    String publisher = sc.next();
	    System.out.println("\nQuantity: ");
	    int quantity = sc.nextInt();
	    
	    
	    Book b4 = new Book(id,name, author, publisher, quantity);
	   
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3); 
	    list.add(b4);
	    
	    //printing book
	    for(Book b:list){  
	        //System.out.println(list);
	    	System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+""
	    			+ " "+b.getQuantity());  
	        }  
	    
	    //Search in the linked list
	    Scanner input=new Scanner(System.in);
        System.out.print("Enter ID to display: ");
        Integer rec=input.nextInt();
        //Integer in = b.getId();
        for(Book bo:list){
            if(bo.getId() == rec){
            	System.out.println(bo.getId()+" "+bo.getName()+" "+bo.getAuthor()+" "+bo.getPublisher()+""
    	    			+ " "+bo.getQuantity());  
            	
            }
        }
	}

}

//
////Converting Array to List  
//List<String> list=new ArrayList<String>();  
//for(String lang:array){  
//list.add(lang);  