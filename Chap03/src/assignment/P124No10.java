package assignment;

import java.util.Scanner;

public class P124No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("양의 정수를 입력하세요 :");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num))
			System.out.println(num + "는 소수입니다.");
		else
			System.out.println(num + "는 소수가 아닙니다.");
	}
    public static boolean isPrime(int inputGab){
        boolean temp = true;
        if (inputGab>1 && (inputGab%2==1) && (inputGab%3!=0)) { 
            temp = true;
        }
        else {
            temp = false;
        }
        return temp;
    }
}

