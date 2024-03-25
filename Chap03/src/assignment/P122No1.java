package assignment;

import java.util.Scanner;

public class P122No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 :");
		int n = sc.nextInt();
		if(n>=19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
	}

}
