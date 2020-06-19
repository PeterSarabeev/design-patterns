package combined;

import combined.chainofresponsibility.*;
import combined.observer.*;

public class MainClass {

	public static void main(String[] args) {
		PackageD chain = PackageController.getChain();

		Manager manager = new Manager("Jeffree");
		Employee steven = new Employee(manager, "Steven");
		Employee sarah = new Employee(manager, "Sarah");
		Employee john = new Employee(manager, "John");

		manager.checkAssignedEmployees();
		System.out.println(manager.getHasCounter());
		//PackageController.printOrderList();
		manager.assign(steven, 1);
		manager.assign(sarah, 2);
		manager.assign(john, 3);
		
		manager.checkAssignedEmployees();
		System.out.println(manager.getHasCounter());
		
		System.out.println();
		chain.takeOrder(1, "Plovidv");
		chain.takeOrder(2, "Sofia");
		chain.takeOrder(3, "Serbia");
		System.out.println();

		PackageController.distributeOrders(manager.getEmployeeList());
		manager.updateAssignments();
		PackageController.printOrderList();
		PackageController.printOrderLog();

		System.out.println();
		chain.takeOrder(1, "Plovdiv");
		chain.takeOrder(2, "Montana");
		chain.takeOrder(3, "Romania");
		System.out.println();

		PackageController.distributeOrders(manager.getEmployeeList());
		manager.updateAssignments();
		PackageController.printOrderList();
		PackageController.printOrderLog();

	}
}
