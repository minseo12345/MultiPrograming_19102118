package assignment;

public class P304No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller[] c = {new TV(false), new Radio(true)};
		
		for(Controller controller : c) {
			controller.show();
		}
	}
	
}
