public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public void performFlyBehavior() {
		flyBehavior.fly();
	}

	public void  performQuackBehavior() {
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}

	protected abstract void displayDuck();

	//common duck methods (encapsulated)
	public void getNumberOfLegs() {
		System.out.println("Number of legs: 2");
	}

	public void getHasWings() {
		System.out.println("Yes... Ducks have wings");
	}
}