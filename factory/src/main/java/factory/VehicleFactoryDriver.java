package factory;

public class VehicleFactoryDriver {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle("Car");
		Vehicle bike = VehicleFactory.getVehicle("bike");
		car.setMake("Honda");
		car.setVIN("ZSER");
		bike.setMake("Hero");
		bike.setVIN("SWE");
		System.out.println("Car information  "+car.getMake()+" "+car.getVIN()+" "+car.getWheels());
		System.out.println("Bike information  "+bike.getMake()+" "+bike.getVIN()+" "+bike.getWheels());
	}

}
