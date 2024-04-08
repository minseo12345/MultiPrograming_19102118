package assignment;

public class P208No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countChar("안녕하세요",'안'));
	}
	static int countChar(String s, char c) {
	int count = 0;
	for(int i =0; i<s.length(); i++) {
		if(s.charAt(i) ==c) {
			count++;
		}
	}
	return 	count;
		
	}
}
