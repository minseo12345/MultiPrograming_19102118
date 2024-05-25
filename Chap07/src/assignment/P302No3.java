package assignment;

import java.util.Arrays;

public class P302No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = {
				new Book(15000), new Book(50000), new Book(20000)
		};
		for(Book b: books) {
			b.show();
		}
		
		Arrays.sort(books);
		
		for(Book b : books) {
			b.show();
		}
	}

}
