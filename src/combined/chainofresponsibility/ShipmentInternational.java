package combined.chainofresponsibility;

public class ShipmentInternational extends PackageD {

	public ShipmentInternational() {
		this.destination = PackageD.INTERNATIONAL;
	}
	
	@Override
	protected void writeMessage(String message) {
		System.out.println("International shipment: " + message);
		
	}

	@Override
	protected void placeOrder(String message) {
		//System.out.println("International shipment placed: " + message);
		PackageController.listOrder(this);
	}
}
