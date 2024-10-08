package fordcar;

public class BrakeWithABS implements IBrakeBehavior {

	@Override
	public void brake() {
		System.out.println("Brake with ABS applied");

	}

}