package assignment;

interface Human{
	void eat();
	void print();

	static void echo() {
		
		System.out.println("야호!");
	}
}
class Worker implements Human{
	
	public void print() {
		System.out.println("인간입니다.");
	}
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
}

class Student implements Human{
	private int age;
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
	Student(int age){
		this.age=age;
	}
	public void print() {
		System.out.println(age+"의 학생입니다.");
	}
	
	
}

public class P304No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Human p = new Worker();
		
		p.print();
		p.eat();
	}

}
