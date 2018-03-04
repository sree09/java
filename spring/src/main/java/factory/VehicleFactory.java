package factory;

public abstract class VehicleFactory{
	 public static Vehicle getVehicle(String vehicle_type) {
		 if ( vehicle_type.equalsIgnoreCase("CAR") )
		      return new Car();
		 else if (vehicle_type.equalsIgnoreCase("Bike"))
		      return new Bike();
		 else
			 return null;
	    }
}
