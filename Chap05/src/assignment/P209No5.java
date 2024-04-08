package assignment;

import java.util.Scanner;

public class P209No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String star[] = new String[10];
		int numbers[] = new int [10];
		System.out.println("숫자를 10개 입력하세요.");
		for(int j =0; j<10; j++) {
			star[j] = "";
		}
		for (int i = 0; i < 10; i++) {
			int number = sc.nextInt();
			numbers[i] = i;
			if (number >= 90 && number < 100) {
				star[9] += "*";
			} else if (number >= 80) {
				star[8] += "*";
			} else if (number >= 70) {
				star[7] += "*";
			} else if (number >= 60) {
				star[6] += "*";
			} else if (number >= 50) {
				star[5] += "*";
			} else if (number >= 40) {
				star[4] += "*";
			} else if (number >= 30) {
				star[3] += "*";
			} else if (number >= 20) {
				star[2] += "*";
			} else if (number >= 10) {
				star[1] += "*";
			} else if (0 < number && number < 10) {
				star[0] += "*";
			}
		}
		for(int i = 0; i<star.length; i++) {
			if(i==0) {
				System.out.println(" " + numbers[i] * 10+ "~"+(numbers[i]*10+9)+":"+star[i]);
			}else {
				System.out.println(numbers[i]*10+"~"+(numbers[i]*10+9)+":"+star[i]);
			}
		}
		
	}

}
