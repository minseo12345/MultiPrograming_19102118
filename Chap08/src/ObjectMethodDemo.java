import Mouse.keyboard;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse m1 = new Mouse("Logitech");
		Mouse m2 = new Mouse("Logitech");
		
		Mouse m3 = m1;
		
		keyboard k1 = new Keyboard("Microsift");
		keyboard k2 = new Keyboard("Microsift");
		
		System.out.println(m1.toString());
		System.out.println(m1);
		
		System.out.println(k1.toString());
				System.out.println(k1);
				
			System.out.println(m1.equals(m2));
			System.out.println(m1.equals(m3));
			System.out.println(k1.equals(k2));
	}

}
