package assignment;

import java.util.Scanner;

public class P209No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String addres[] = new String[5];
		while(true) {
			System.out.println("URL을 입력하세요");
			String url = sc.next();
			if(url.equalsIgnoreCase("bye")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(url.endsWith("com")) {
				System.out.println(url+"'com'으로 끝납니다.");
			}else {
				System.out.println("'com'으로 끝나지 않습니다.");
			}
			if(url.contains("java")) {
				System.out.println(url + "'java'를 포함합니다.");
			}else {
				System.out.println("'java'를 포함하지 않습니다.");
			}
		}
	}

}
