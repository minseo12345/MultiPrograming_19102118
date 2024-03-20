package assignment;

import java.util.Scanner;

public class P80No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  임의의 소문자로 초기화된 char 타입 변수 c를 대문자로 변환해 주는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 소문자를 입력하세요.");
		char c = sc.nextLine().charAt(0);
		int a = (int)'A'-(int)'a';
		char ch = (char)((int) c+a);
		System.out.println(ch);
	}

}
