package assignment;

public class P123No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 1; a<20; a++) {
			for(int b = 1; b<20; b++) {
				for(int c = 1; c<20; c++) {
					if((a*a+b*b==c*c)&&(a+b+c<=20)) {
						System.out.printf("각 변의 길이는 %d,%d,%d",a,b,c);
					}
				}
			}
		}
	}

}
