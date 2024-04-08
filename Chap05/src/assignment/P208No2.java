package assignment;

public class P208No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumExceptFirst(1,2,3,4));
		int arr[] = {1,2,3};
		System.out.println(sumExceptFirst(1,arr));
		System.out.println(sumExceptFirst(1,2,3,4,5));
	}
	static int sumExceptFirst(int b, int...v) {
		int sum = 0;
		for(int i: v) {
			sum +=i;
		}
		return sum;
	}

}
