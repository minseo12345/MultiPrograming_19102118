package assignment;

import java.util.Scanner;

public class P81No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드로부터 0부터 999사이의 정수를 입력받아 각 자릿수를 더한 결과를 출력하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("0~999사이의 숫자를 입력하세요 :");
		int a = sc.nextInt();
		if(a<0 || a>999) {
			System.out.println("0~999 사이의 숫자가 아닙니다. 프로그램 종료 ");
		}else {
			int b = a/100;
			int c = (a%100)/10;
			int d = a%10;
			int sum = b + c + d;
			System.out.println("각 자리 수의 합:" + sum);
		}
	}

}
