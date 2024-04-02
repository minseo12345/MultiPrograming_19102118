package assignment;
 class Dice {
    int face;           // 속성=변수

    int roll(){
        return face;
    }
    
    Dice(){
        face = (int) (Math.random() * 6) + 1; 
    }
}
public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dice d = new Dice();
	        System.out.println("주사위의 숫자 : " + d.roll());
	}

}
