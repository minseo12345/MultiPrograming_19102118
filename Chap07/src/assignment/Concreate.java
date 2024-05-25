package assignment;

public class Concreate extends Abstract {

	int j;
	
	Concreate(int i, int j){
		super(i);
		this.j = j;
	}
	@Override
	void show() {
		System.out.println("i = " + i + ", j = " + j);
	}
	
}
