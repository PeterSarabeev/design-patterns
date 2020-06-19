package combined.chainofresponsibility;

public abstract class PackageD implements Cloneable {

	public static int CYTY = 1;
	public static int COUNTRY = 2;
	public static int INTERNATIONAL = 3;

	protected String destinationName;
	protected int destination;
	protected PackageD nextDestination;
	protected PackageD finalize;

	public void setNextDestination(PackageD nextDestination) {
		this.nextDestination = nextDestination;
	}

	public void takeOrder(int destination, String message) {

		if (this.destination <= destination) {
			this.writeMessage(message);
		}

		if (this.destination == destination) {
			this.destinationName = message;
			this.placeOrder(message);
		}

		if (this.nextDestination != null)
			this.nextDestination.takeOrder(destination, message);

	}

	@Override
	public PackageD clone() throws CloneNotSupportedException {
		return (PackageD) super.clone();
	}
	
	public int getDestination() {
		return this.destination;
	}

	public void printPackageInfo() {
		this.writeMessage(destinationName);
	}

	abstract protected void writeMessage(String message);

	abstract protected void placeOrder(String message);

}
