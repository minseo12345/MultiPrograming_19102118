package assignment;

import java.util.Scanner;

public class P81No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 세 개의 학점을 각각 키보드로 입력받아 졸업 여부를 출력하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("전공 이수 학점 :");
		int a = sc.nextInt();
		System.out.println("교양 이수 학점");
		int b = sc.nextInt();
		System.out.println("일반 이수 학점:");
		int c = sc.nextInt();
		if(a >= 70 && (b>=30&&c>=30 || c+b>=80) && a+b+c>=140  ) {
			System.out.println("졸업 가능");
		}else {
			System.out.println("졸업 불가능");
		}
			
	}

}
