package assignment;

public enum Grade {
	A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");
	
	private String s;
	Grade(String s){
		this.s= s;
		
	}
	public String toString() {
		return s;
	}
}
