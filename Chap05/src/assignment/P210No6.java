package assignment;

import java.util.Arrays;

public class P210No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[] { 1,2,3,4,5 };
		
		System.out.println(Arrays.toString(reverse(number)));
	}
	public static int[] reverse(int[] org) {
		int temp[] = new int[5];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 4 - i; j >= 0; j--) {
				temp[i] = org[j];
                break;
			}
		}
		return temp;
	}
}
