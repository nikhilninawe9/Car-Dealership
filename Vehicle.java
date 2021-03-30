package car_dealership;

public class Vehicle {

	private String vehicleName;
	private String vehicleMake;
	private double vehiclePrice;

	public Vehicle() {
		super();
	}

	public Vehicle(String vehicleName, String vehicleMake, double vehiclePrice) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleMake = vehicleMake;
		this.vehiclePrice = vehiclePrice;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public double getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

//	@Override
//	public String toString() {
//		return "Vehicle [vehicleName=" + vehicleName + ", vehicleMake=" + vehicleMake + ", vehiclePrice=" + vehiclePrice
//				+ "]";
//	}
}
