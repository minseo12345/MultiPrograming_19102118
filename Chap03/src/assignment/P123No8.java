package assignment;

public class P123No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	static int factorial(int n) {
		return switch (n) {
		case 1 -> 1;
		default -> n * factorial(n - 1);  
		};
	}
}
