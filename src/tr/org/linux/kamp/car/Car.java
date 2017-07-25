package tr.org.linux.kamp.car;

public class Car {

	private int gear;
	private int speed;
	private String brand;
	
	public Car(int gear, int speed, String brand) {
		this.gear=gear;
		this.speed=speed;
		this.brand=brand;
		
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void speedUp(int a) {
		this.speed+=a;
	}
	
	public void speedDown(int a) {
		this.speed-=a;
	}
	
	public void changeGear(int gear) {
		this.gear=gear;
	}
	
}
