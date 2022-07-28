package week3.day1;

public class Vehicle {
	public void applyBrake() {
		System.out.println("Brakes applied...Vehicle stopped");
	}
	
	public void applyBrake(String vehType) {
		System.out.println("Applied brake for "+vehType);
	}
}
