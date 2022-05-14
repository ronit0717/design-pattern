public abstract class Duck {
	protected abstract FlyBehavior getFlyBehavior();
	protected abstract QuackBehavior getQuackBehavior();
	protected abstract void displayDuck();

	//common duck methods (encapsulated)
	public void getNumberOfLegs() {
		System.out.println("Number of legs: 2");
	}

	public void getHasWings() {
		System.out.println("Yes... Ducks have wings");
	}
}