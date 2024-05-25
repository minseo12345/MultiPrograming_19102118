
public class Notebook extends Computer implements Portable {
	public void inMyBat() {
		System.out.println("노트북은 가방안에 있따");
	}
	
	public void turnOn() {
		System.out.println("노트북을 켠다.");
		
	}
	
	public void turnOff() {
		System.out.println("노트북을 끈다.");
		
		
	}
	
	public static void main(String[] args) {
		Notebook n = new Notebook();
		n.trunOn();
		n.trunOff();
		n.inMyBag();
		
		
	}
	
}
