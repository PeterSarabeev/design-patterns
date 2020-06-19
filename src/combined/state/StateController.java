package combined.state;

import combined.observer.Employee;

public class StateController {
	
	private static StateWaiting waiting = new StateWaiting();
	private static StateReady ready = new StateReady();
	
	public static void setStateWaiting(Employee employee) {
		waiting.setState(employee);
	}
	
	public static void setStateReady(Employee employee) {
		ready.setState(employee);
	}
}
