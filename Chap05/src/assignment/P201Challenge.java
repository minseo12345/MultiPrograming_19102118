package assignment;

import java.util.Scanner;

public class P201Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("학생 수를 입력해주세요");
		numOfStudents = in.nextInt();
		int [] scores = new int [numOfStudents];
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i = 0; i<numOfStudents; i++) {
			int score = in.nextInt();
			scores[i] = score;
		}
		Grade grade;

		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
//		for(int i =0; i<scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		for(int score : scores) {
			System.out.println(score);
		}	
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=90) {
				grade = Grade.valueOf("A");
				System.out.println((i+1) + "번 학생의 등급은"+ grade+ "입니다.");
			}else if(scores[i]>=80) {
				grade = Grade.valueOf("B");
				System.out.println((i+1) + "번 학생의 등급은"+ grade+ "입니다.");
			}else if(scores[i]>=70) {
				grade = Grade.valueOf("C");
				System.out.println((i+1) + "번 학생의 등급은"+ grade+ "입니다.");
			}else if(scores[i]>=60) {
				grade = Grade.valueOf("C");
				System.out.println((i+1) + "번 학생의 등급은"+ grade+ "입니다.");
			}else {
				grade = Grade.valueOf("D");
				System.out.println((i+1) + "번 학생의 등급은"+ grade+ "입니다.");
			}
		}
	}


}
