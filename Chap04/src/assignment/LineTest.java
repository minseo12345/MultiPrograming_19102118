package assignment;
class Line {
    int length;

    boolean isSameLine(Line b){
        if (length == b.length){
            return true;
        }
        else 
        	return false;
    }
    
    Line(int length){
        this.length = length;
    }
}
public class LineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Line a = new Line(1);
	        Line b = new Line(1);

	        System.out.println(a.isSameLine(b));
	        System.out.println(a == b);
	}

}
