package assignment;

public abstract class Countable1 {
	protected String name;
	protected int num;
	Countable1(String name,int num){
		this.name= name;
		this.num = num;
	}
	abstract void count();
}
