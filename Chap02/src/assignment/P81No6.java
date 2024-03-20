package assignment;

import java.util.Scanner;

public class P81No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드로 화씨온도를 입력받아 섭씨온도로 환산하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨온도를 입력해주세요 :");
		double f = sc.nextDouble();
		double c = (5*(f-32))/9;
		System.out.println("섭씨온도는"+c+"입니다.");
	}

}
