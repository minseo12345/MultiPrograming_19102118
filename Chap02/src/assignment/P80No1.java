package assignment;

public class P80No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=6; i++) {	// 공백을 위한 반복문
			for(int j = 0; j <=6-i; j++)
				System.out.print(" ");
			for(int j =1; j <=(i*2)-1; j++) // *을 홀수만 출력하기 위한 반복문
				System.out.print("*");
			System.out.println(); // 한행을 다 출력하면 다음열로 넘어감
		}
	}

}
