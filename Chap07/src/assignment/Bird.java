package assignment;

public class Bird implements Countable {
	String name;
	Bird(String s){
		this.name = s;
	}
	public void count() {
		System.out.println(name +" 2마리 있다.");
	}
	void fly() {
		System.out.println("2마리" + name + "가 날아간다.");
	}


}
