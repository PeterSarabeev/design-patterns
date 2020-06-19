package combined.state;

import combined.observer.Employee;

public interface State {
	public void setState(Employee employee);
	public String getStateName();
}
