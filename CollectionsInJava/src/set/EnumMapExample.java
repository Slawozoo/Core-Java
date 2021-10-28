package set;

import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class EnumMapExample {
// Creating enum  
	public enum Key {
		One, Two, Three, Four
	};

	public static void main(String[] args) {
		EnumMap<Key, Book> map = new EnumMap<Key, Book>(Key.class);
		// Creating Books
		Scanner sc = new Scanner(System.in);
		// USer input for one class
		System.out.print("Id : ");
		int id = sc.nextInt();
		System.out.print("\nName: ");
		String name = sc.next();
		System.out.print("\nAuthor: ");
		String author = sc.next();
		System.out.print("\nPublisher: ");
		String publisher = sc.next();
		System.out.print("\nQuantity: ");
		int quantity = sc.nextInt();

		Book b4 = new Book(id, name, author, publisher, quantity);
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to Map
		map.put(Key.Four, b4);
		map.put(Key.One, b1);
		map.put(Key.Two, b2);
		map.put(Key.Three, b3);
		// Traversing EnumMap
		System.out.println("ID		"+"Name			\t\t"+"Author		\t\t"+"Publisher			"+"Quantity");
		for (Map.Entry<Key, Book> entry : map.entrySet()) {
			Book b = entry.getValue();
			System.out.println(b.id + "\t\t" + b.name + "\t\t\t\t " + b.author + "\t\t\t\t " + b.publisher + "\t\t\t\t" + b.quantity);
		}
	}
}