package combined.state;

import combined.observer.Employee;

public class StateWaiting implements State {

	private String stateName = "WAITING_STATE";
	
	public String getStateName() {
		return this.stateName;
	}

	@Override
	public void setState(Employee employee) {
		employee.setState(this);	
	}
}
