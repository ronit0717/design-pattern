public class AmericanFlyingDuck extends Duck {
	public FlyBehavior getFlyBehavior() {
		return new FlyWithWings();
	}

	public QuackBehavior getQuackBehavior() {
		return new Quack();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is an American flying duck ...");
	}
}