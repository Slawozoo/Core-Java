package queue;

import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int quantity;

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

	public int compareTo(Book b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class BookQueue {
	public static void main(String[] args) {
		Queue<Book> queue = new PriorityQueue<Book>();
		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding Books to the queue
		queue.add(b1);	//add element to the queue
		queue.add(b2);
		queue.add(b3);
		System.out.println("Traversing the queue elements:");
		// Traversing queue elements
		for (Book b : queue) {
			System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
		}
		queue.remove();	//remove head of the queue
		queue.poll(); 	//remove head and retrives element and return false if null
		System.out.println("After removing one book record:");
		for (Book b : queue) {
			System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
		}
	}
}

