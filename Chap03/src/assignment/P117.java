package assignment;

import java.util.Scanner;

public class P117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼을 구할 정수:");
		
		n = sc.nextInt();
		
		if(n<0) {
			System.out.println("음수는 입력할 수 없습니다.");
		}
		
//		for(int i = 1; i <= n; i++ ) {
//			result *= i;
//		}
//		while(n>0) {
//			result *=n;
//			n--;
//		}
		
//		while(true) {
//			result *= n;
//			n--;
//			if(n==0) {
//				break;
//			}
//		}
//		result = factorial(3,5);
		System.out.println(factorial(5));
		System.out.println(factorial(1,5));
		System.out.println(factorial(3,5));
		System.out.println(factorial(10,5));
	}

	static int factorial(int x) {
		int r = 1;
		
		for(int i = 1; i <= x; i++ ) {
		r *= i;
	}
		return r;
	}
	
	static int factorial(int x, int y) {
	    int r = 1;
	    for(int i = x; i <= y; i++) {
	        r *= i;
	    }
	    return r;
	}


}
