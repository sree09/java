package factory;

public interface Vehicle {
	int wheels = 0;
	public void setWheels();
	public int getWheels();
	public void setVIN(String vin);
	public void setMake(String make);
	public String getVIN();
	public String getMake();
}