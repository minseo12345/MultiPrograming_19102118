
public class Computer implements Controllable {
	
	@Override
	public void trunOn() {
		System.out.println("TV를 켠다.");
	}
	
	@Override
	public void trunOff() {
		System.out.println("TV를 끈다.");
	}
	
}
