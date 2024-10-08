package fordcar;

public class CarExample {

	public static void main(final String[] arguments) {
		Car sedanCar = new Sedan();
		sedanCar.applyBrake(); // This will invoke class "Brake"

		Car suvCar = new Suv();
		suvCar.applyBrake(); // This will invoke class "BrakeWithABS"

		// set brake behavior dynamically
		suvCar.setBrakeBehavior(new Brake());
		suvCar.applyBrake(); // This will invoke class "Brake"
	}

}
