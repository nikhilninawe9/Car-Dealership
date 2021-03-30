package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setName("Shashank");
		customer1.setAddress("Bakers street, London");
		customer1.setCashOnHand(12000);

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("BMW M3");
		vehicle1.setVehicleMake("German");
		vehicle1.setVehiclePrice(11000);

		Employee emp1 = new Employee();
		customer1.purchaseCar(vehicle1, emp1, false);

		Customer cust2 = new Customer("Ansh", "Paris", 20000);
		Vehicle veh2 = new Vehicle("Mers s-6", "German Car", 22000);
		Employee emp2 = new Employee();
		cust2.purchaseCar(veh2, emp2, false);
	}

}
