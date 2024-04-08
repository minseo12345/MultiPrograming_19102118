package assignment;

import java.util.Scanner;

enum Day {
    SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");

    private String s;

    Day(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
    
public class P211No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        String putDay = in.next();

	        Day.valueOf(putDay.toUpperCase());
	        System.out.println(Day.valueOf(putDay.toUpperCase()) + "은 싫다");
	        equalDay(putDay.toUpperCase());
	        System.out.println(equalDay(putDay));
	}
	  public static String equalDay(String PutDay) {
	        return switch (PutDay) {
	            case "SUNDAY", "SATURDAY" -> "최고";
	            case "MONDAY" -> "싫다.";
	            case "FRIDAY" -> "좋다.";
	            default -> "그저 그렇다.";
	        };
	    }
}
}
