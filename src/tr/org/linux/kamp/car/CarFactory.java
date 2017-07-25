package tr.org.linux.kamp.car;

public class CarFactory {

	public static void main(String[] args) {
		Car car = new Car(3, 100, "bmw");
		Car car2 = new Car(5, 120, "bmw");

		System.out.println("speed of first car is:"+  car.getSpeed());
		System.out.println(car.getGear());
		System.out.println(car.getBrand());
		
		System.out.println(car2.getSpeed());
		System.out.println(car2.getGear());
		System.out.println(car2.getBrand());
		
		car2.speedUp(50);
		car2.setGear(5);
		car.speedDown(60);
		car.setGear(3);
		
		
		System.out.println();
		System.out.println(car.getSpeed());
		System.out.println(car.getGear());
		System.out.println(car.getBrand());
		
		System.out.println(car2.getSpeed());
		System.out.println(car2.getGear());
		System.out.println(car2.getBrand());
		
		
	}
}
