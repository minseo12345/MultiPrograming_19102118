package assignment;

import java.util.Scanner;

public class P123No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("철수 : ");
		String a = sc.next();
		System.out.println("영희 : ");
		String b = sc.next();
		if(a.equals("r") && b.equals("s")) {
			System.out.println("철수, 승!");
		}else if(a.equals("s") && b.equals("p")) {
			System.out.println("철수, 승!");
		}else if(a.equals("p") && b.equals("r")) {
			System.out.println("철수, 승!");
		}else if(a.equals(b)) {
			System.out.println("무승부");
		}else {
			System.out.println("영희, 승!");
		}
	}
  
}
