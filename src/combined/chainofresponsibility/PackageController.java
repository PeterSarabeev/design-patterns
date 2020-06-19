package combined.chainofresponsibility;

import java.util.ArrayList;

import combined.observer.Employee;
import combined.state.StateController;

public class PackageController {

	private static PackageD city = new ShipmentCity();
	private static PackageD country = new ShipmentCountry();
	private static PackageD international = new ShipmentInternational();
	private static ArrayList<PackageD> orderBuffer = new ArrayList<PackageD>();
	private static ArrayList<PackageD> pacakgeLog = new ArrayList<PackageD>();

	public static PackageD setPackageAssignment(int destination) {
		switch (destination) {
		case 1:
			return new ShipmentCity();
		case 2:
			return new ShipmentCountry();
		case 3:
			return new ShipmentInternational();
		default:
			return null;
		}
	}

	public static PackageD getChain() {
		city.setNextDestination(country);
		country.setNextDestination(international);
		return city;
	}

	public static void listOrder(PackageD packageD) {
		orderBuffer.add(packageD);
	}

	public static void printOrderList() {
		System.out.println("\nOrder List:");
		if (orderBuffer.size() != 0)
			for (PackageD order : orderBuffer)
				order.printPackageInfo();
		else
			System.out.println("There are no acitve orders.\n");
	}

	public static void logOrder(PackageD packageD) {
		try {
			pacakgeLog.add(packageD.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public static void printOrderLog() {
		System.out.println("\nCompleted transactions:");
		if (pacakgeLog.size() != 0)
			for (PackageD order : pacakgeLog)
				order.printPackageInfo();
		else
			System.out.println("There are no completed orders.\n");
	}

	public static void distributeOrders(ArrayList<Employee> employees) {
		for (Employee employee : employees) {
			if (employee.getAssignment() != null)
				if (employee.getStateName().equals("WAITING_STATE")) {
					for (PackageD buffer : orderBuffer) {
						if (employee.getAssignment().getClass().equals(buffer.getClass())) {
							// System.out.println(employee.getName() + " -> " + buffer.getClass());
							employee.setAssignment(buffer);
							orderBuffer.remove(buffer);
							StateController.setStateReady(employee);
							break;
						}
					}
				}
		}
	}
}
