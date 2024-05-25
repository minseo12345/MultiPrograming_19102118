
public class ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Computer com = new Computer();
		tv.turnOn();
		tv.trunOn();
		tv.repair();
		com.turnOn();
		com.trunOff();
		com.repair();
		Controllable.reset();
	}

}
