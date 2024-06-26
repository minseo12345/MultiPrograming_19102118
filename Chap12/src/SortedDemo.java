import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s1 = Stream.of("d2","a2","b1","b3","c");
		Stream<Nation> n2 = 
				n1.sorted(Comparator.comparing(Nation::getName));
		
		Stream<String> s3 = n2.map(x->x.getName());
		s3.forEach(Util::printWithParenthesis);
		
		System.out.println("\n국가 GDP 순서");
		
		Stream<Nation> n3 = Nation.nations.stream();
		Stream<Nation> n4 = n3.sorted(Comparator.comparing(Nation::getGdpRank));
		Stream<String> s4 = n4.map(Nation::getName);
		
		s4.forEach(Util::printWithParenthesis);
	}

}
