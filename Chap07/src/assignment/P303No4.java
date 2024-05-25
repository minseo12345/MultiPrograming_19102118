package assignment;

public class P303No4 {
	static void speak(Talkable t) {
		t.talk();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak(new Korean());
		speak(new American());
		
	}

}
