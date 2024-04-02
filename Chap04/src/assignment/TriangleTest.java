package assignment;
class Triangle{
	double height;
	double width;
	
	Triangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	public double findArea() {
		return (height*width)/2;
	}
	
	public boolean isSameArea(Triangle t) {
		if(this.findArea() == t.findArea()) {
			return true;
		}else {
			return false;
		}
	}
}
public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(10.0,5.0);
		Triangle t2 = new Triangle(5.0,10.0);
		Triangle t3 = new Triangle(8.0,8.0);
		
		System.out.println(t1.findArea());
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
		
	}

}
