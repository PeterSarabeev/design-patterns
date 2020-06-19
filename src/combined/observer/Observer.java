package combined.observer;

public interface Observer {
	public void addEmployee(Employee employee);
	public void assign(Employee employee, int destination);
	public void checkAssignedEmployees();
	public void updateAssignments();
}
