package combined.observer;

import combined.chainofresponsibility.PackageController;
import combined.chainofresponsibility.PackageD;
import combined.state.State;
import combined.state.StateController;

public class Employee implements Observable {

	private String name;
	private boolean isAssigned;
	private PackageD assignment;
	private State state;

	public Employee(Observer manager, String name) {
		this.name = name;
		this.isAssigned = false;
		StateController.setStateWaiting(this);
		manager.addEmployee(this);
	}

	@Override
	public void assignmentPosition(int destination) {
		this.assignment = PackageController.setPackageAssignment(destination);
	}
	
	public String getName() {
		return this.name;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public String getStateName() {
		return getState().getStateName();
	}

	
	public void setAssignment(PackageD buffer) {
		this.assignment = buffer;
	}
	
	public PackageD getAssignment() {
		return assignment;
	}

	public boolean getIsAssigned() {
		return isAssigned;
	}

	public void setIsAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
	}

	

}
