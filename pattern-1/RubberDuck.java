public class RubberDuck extends Duck {
	public FlyBehavior getFlyBehavior() {
		return new FlyNoWay();
	}

	public QuackBehavior getQuackBehavior() {
		return new Squeak();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is a rubber duck ...");
	}
}