package assignment;

public class Book implements Comparable<Book>{
	int price;
	
	Book(int price){
		this.price = price;
	}
	
	  @Override
	    public int compareTo(Book other) {
	        return Integer.compare(this.price, other.price);
	    }
	  
	void show() {
		System.out.println("Book [ price =" + price + "]" );
	}
}
