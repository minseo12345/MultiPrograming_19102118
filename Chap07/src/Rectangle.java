
public class Rectangle extends Shape {
	
	int radius;
	
	public Rectangle(int radius) {
		this.radius=radius;
	}
	
	public void draw() {
		System.out.println("사각형을 그리다");
	}
	
	public double findArea() {
		return pi * radius * radius;
	}
}
