package assignment;

import java.util.Scanner;

public class P80No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 원기둥의 반지름을 구하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("원기둥의 밑면 반지름은?");
		double r = sc.nextDouble();
		System.out.println("원기둥의 높이는?");
		double h = sc.nextDouble();
		System.out.println("원기둥의 부피는?" + 3.14*(r*r)*h);
	}

}
