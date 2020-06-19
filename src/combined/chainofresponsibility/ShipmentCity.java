package combined.chainofresponsibility;

public class ShipmentCity extends PackageD {	
	
	public ShipmentCity() {
		this.destination = PackageD.CYTY;
	}
	
	@Override
	protected void writeMessage(String message) {
		System.out.println("City shipment: " + message);
		
	}

	@Override
	protected void placeOrder(String message) {
		//System.out.println("City shipment placed: " + message);
		PackageController.listOrder(this);
	}
}
