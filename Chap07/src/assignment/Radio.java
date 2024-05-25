package assignment;

public class Radio extends Controller {
	public boolean power;
	
	Radio(boolean power){
		this.power=power;
	}
	
	public void show() {
		if(power) {
			System.out.println("라디오가 켜졌습니다.");
		}else {
			System.out.println("라디오가 꺼졌습니다.");
		}
	}
	
	public String getName() {
		return "라디오";
	}
}
