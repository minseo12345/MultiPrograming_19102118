package assignment;

import java.util.Scanner;

public class P122No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int n;
	int sum = 0;
		do {
			System.out.println("양의 정수를 입력해주세요:");
			n = sc.nextInt();
			if(n%2==0)
			sum +=n;
			
		}while(n>=0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+sum);
	}

}
