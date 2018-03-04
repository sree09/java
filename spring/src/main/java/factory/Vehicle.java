package factory;

public interface Vehicle {
	public void setWheels(int wheels);
	public int getWheels();
	public void setVIN(String vin);
	public void setMake(String make);
	public String getVIN();
	public String getMake();
}