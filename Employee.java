package car_dealership;

public class Employee {

	private String employeeName;
	private int employeeId;
	private double employeeSalary;

	public Employee(String employeeName, int employeeId, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}

	public Employee() {
		super();
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if (finance == true) {
			double loanAmount = vehicle.getVehiclePrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		} else if (vehicle.getVehiclePrice() <= customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		} else {
			System.out.println("Insufficient funds, Must bring more money!..");
		}

	}

	public void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Ran credit history for Customer!..");
		System.out.println("Customer can buy the car!..");
	}

	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("Customer " + customer.getName() + " has purchased the car " + vehicle.getVehicleName()
				+ " for " + vehicle.getVehiclePrice() + " on cash!..");
	}

}
