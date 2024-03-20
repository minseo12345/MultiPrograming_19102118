package assignment;

import java.util.Scanner;

public class P80No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 초를 입력하면 시간, 분, 초로 환산해 출력해주는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int h = a/(60*60);
		int m = a/60;
		int s = a%m;
		System.out.println(h+"시간"+m+"분"+s+"초");
	}

}
