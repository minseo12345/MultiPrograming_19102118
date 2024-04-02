package assignment;

class Printer {
	
	private	int numOfPapers = 0;
	private boolean duplex;
	
	
	Printer(int numOfPapers){
		this.numOfPapers = numOfPapers;
	}
	Printer(int numOfPapers, boolean duplex){
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	public boolean getDuplex() {
		return this.duplex;
	}
	public void setDuplex(boolean duplex) {
		this.duplex=duplex;
	}
	
	public void print(int amount) {
		
		if(this.duplex == true) {
			if(numOfPapers - (int)(amount/2)> 0) {
				this.numOfPapers = numOfPapers - (int) Math.ceil(amount / 2.0);;
				System.out.println("양면으로" + (int) Math.ceil(amount / 2.0) + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");	
			}
			else if(amount>numOfPapers && numOfPapers > 0) {
				int a = amount - numOfPapers;
				System.out.println("모두 출력하려면 용지가" + a  + "매 부족합니다." + numOfPapers+"장만 출력합니다.");
				this.numOfPapers = 0;
			}
			else if(this.numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
			}
		}else if(this.duplex == false) {
			if(numOfPapers - amount> 0) {
				this.numOfPapers = numOfPapers - amount ;;
				System.out.println("단면으로" + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");	
			}
			else if(amount>numOfPapers && numOfPapers > 0) {
				int a = amount - numOfPapers;
				System.out.println("단면으로 모두 출력하려면 용지가" + a  + "매 부족합니다." + numOfPapers+"장만 출력합니다.");
				this.numOfPapers = 0;
			}
			else if(this.numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
			}
		}
		
		
		
	}
}
public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = new Printer(20,true);
		p1.print(25);
		p1.setDuplex(false);
		p1.print(10);
	}

}
