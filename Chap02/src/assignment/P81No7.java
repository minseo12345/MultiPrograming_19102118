package assignment;

import java.util.Scanner;

public class P81No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드로 정수를 입력받아 4와 5로 나누어지는지 , 4또는 5로 나누어지는지, 4나 5중 하나로 나누어지지만
		 * 두 수 모두로는 나누어지지 않는지를 true/false로 출력하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 :");
		int a = sc.nextInt();
		if(a%4==0 && a%5==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(a%4==0 || a%5==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if((a%4==0 || a%5==0) && (a%4!=0 && a%5!=0)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
