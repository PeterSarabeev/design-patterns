package combined.observer;

import java.util.ArrayList;

import combined.chainofresponsibility.PackageController;
import combined.state.StateController;

public class Manager implements Observer {

	private String name;
	private ArrayList<Employee> employees;
	private boolean[] hasCounter;

	public Manager(String name) {
		this.name = name;
		employees = new ArrayList<Employee>();
		hasCounter = new boolean[3];
		for (@SuppressWarnings("unused")
		boolean counter : this.hasCounter)
			counter = false;
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public ArrayList<Employee> getEmployeeList() {
		return employees;
	}

	@Override
	public void assign(Employee employee, int destination) {
		employee.assignmentPosition(destination);
		employee.setIsAssigned(true);

	}

	@Override
	public void checkAssignedEmployees() {
		for (Employee employee : this.employees) {

			if (employee.getIsAssigned() == false)
				continue;

			if (employee.getAssignment() != null)
				switch (employee.getAssignment().getDestination()) {
				case 1:
					hasCounter[0] = true;
					break;
				case 2:
					hasCounter[1] = true;
					break;
				case 3:
					hasCounter[2] = true;
					break;
				default:
					break;

				}
		}
	}

	@Override
	public void updateAssignments() {
		for (Employee employee : this.employees) {
			if (employee.getStateName().equals("READY_STATE")) {
				PackageController.logOrder(employee.getAssignment());
				employee.assignmentPosition(employee.getAssignment().getDestination());
				StateController.setStateWaiting(employee);
			}
		}
	}

	public String getName() {
		return name;
	}

	public boolean getHasCounter() {
		return hasCounter[0] && hasCounter[1] && hasCounter[2];
	}
}
