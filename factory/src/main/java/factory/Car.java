package factory;

public class Car implements Vehicle{
	int wheels = 0;
	String VIN,make;
	public void setWheels() {
		wheels = 4;
	}
	public int getWheels() {
		return wheels;
	}
	public void setVIN(String vin) {
		this.VIN = vin;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVIN() {
		return VIN;
	}
	public String getMake() {
		return make;
	}
}
