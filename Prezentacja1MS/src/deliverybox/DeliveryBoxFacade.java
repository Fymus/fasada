package deliverybox;

public class DeliveryBoxFacade {
	private DeliveryBox deliveryBox;
	private DeliveryBoxSystem deliveryBoxSystem;
	
	public DeliveryBoxFacade() {
		deliveryBox = new DeliveryBox();
		deliveryBoxSystem = new DeliveryBoxSystem();
		}
	public void pickupPackage () {
		DeliveryBox deliveryBox = new DeliveryBox();
		DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();
		
		deliveryBox.getUserData();
			if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
				deliveryBox.openBox();
		}
	}
}
