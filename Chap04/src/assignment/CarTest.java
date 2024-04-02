package assignment;
class Car {
	static int numOfCar, numOfRedCar;
	
	public static int getNumOfCar() {
		return numOfCar;
	}

	public static void setNumOfCar(int numOfCar) {
		Car.numOfCar = numOfCar;
	}

	public static int getNumOfRedCar() {
		return numOfRedCar;
	}

	public static void setNumOfRedCar(int numOfRedCar) {
		Car.numOfRedCar = numOfRedCar;
	}

	Car(String color){
		numOfCar++;
		if(color.equals("red") || color.equals("RED")) {
			numOfRedCar++;
		}
	}
	
	
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car c1 = new Car("red");
	        Car c2 = new Car("blue");
	        Car c3 = new Car("RED");

	        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
