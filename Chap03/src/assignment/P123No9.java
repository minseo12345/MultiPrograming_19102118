package assignment;

public class P123No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("안녕",1);
		foo("안녕하세요",1,2);
		foo("잘 있어");
	}
	 private static void foo(String Gab1, int su1) {
	        System.out.printf("%s %d\n", Gab1, su1);
	    }

	    public static void foo(String Gab2, int su2, int su21){
	        System.out.printf("%s %d %d\n", Gab2, su2, su21);
	    }

	    private static void foo(String Gab3) {
	        System.out.println(Gab3);
	    }
}
