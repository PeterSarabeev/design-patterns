package combined.state;

import combined.observer.Employee;

public class StateReady implements State {

	private String stateName = "READY_STATE";
	
	public String getStateName() {
		return this.stateName;
	}

	@Override
	public void setState(Employee employee) {
		employee.setState(this);
	}
}
