package assignment;

import java.util.Scanner;

abstract class Echoer{
	void start() {
		System.out.println("시작합니다.");
	}
	
	abstract void echo();
	
	void stop() {
		System.out.println("종료합니다.");
	}
}
public class P305No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Echoer e = new Echoer() {
			void echo(){
				
				while(true) {
					String a = sc.next();
					System.out.println(a);
					if(a.equals("끝")) {
						break;
					}
				}
			}
		};
		e.start();
		e.echo();
		e.stop();
	}

}
