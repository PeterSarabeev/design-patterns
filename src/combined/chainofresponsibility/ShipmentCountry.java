package combined.chainofresponsibility;

public class ShipmentCountry extends PackageD {

	public ShipmentCountry() {
		this.destination = PackageD.COUNTRY;
	}
	
	@Override
	protected void writeMessage(String message) {
		System.out.println("Country shipment: " + message);
		
	}

	@Override
	protected void placeOrder(String message) {
		//System.out.println("Country shipment placed: " + message);
		PackageController.listOrder(this);
	}
}
