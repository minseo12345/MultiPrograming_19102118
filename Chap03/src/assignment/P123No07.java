package assignment;

import java.util.Scanner;

public class P123No07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = input("철수");
		String y = input("영희");
		whosWin(c,y);
	}
	
    static String input(String rsp) { 
		Scanner sc = new Scanner(System.in);
		String TurnGab = ""; 
        
		if (rsp.equals("철수")) { 
			System.out.print("철수 : ");
			String ChulInput = sc.next();
			TurnGab = ChulInput;
		} else { 
			System.out.print("영희 : ");
			String YoungInput = sc.next(); 
			TurnGab = YoungInput;
		}
		return TurnGab;
	}
    static void whosWin(String Inputc, String Inputy) {
		if (Inputc.equals(Inputy)) {
			System.out.println("무승부");
		} else if (Inputc.equals("r")) { 
			if (Inputy.equals("s")) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승!");
			}
		} else if (Inputc.equals("s")) {
			if (Inputy.equals("p")) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승!");
			}
		} else {
			if (Inputy.equals("r")) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승!");
			}
		}
	}
}
