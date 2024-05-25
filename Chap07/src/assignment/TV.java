package assignment;

public class TV extends Controller {
	public boolean power;
	TV(boolean power){
		this.power = power;
	}
	public void show() {
		if(power) {
			System.out.println("TV가 켜졌습니다.");
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	public String getName() {
		return "TV";
	}
}
