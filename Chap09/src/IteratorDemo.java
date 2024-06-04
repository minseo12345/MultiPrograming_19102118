import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> list = Arrays.asList("다람쥐","개구리","나비");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next() + "-");
		System.out.println();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next()+"+");
			
		System.out.println();
		
		iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next()+"=");
		}
	}

}
