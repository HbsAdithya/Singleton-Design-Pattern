package design.pattern.command;

public class KitchenLight implements Light {

	@Override
	public void on() {
		System.out.println("Swich on() Kitchen Light");
	}

	@Override
	public void off() {
		System.out.println("Swich off() Kitchen Light");
	}
}
