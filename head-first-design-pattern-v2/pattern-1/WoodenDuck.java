public class WoodenDuck extends Duck {
	public FlyBehavior getFlyBehavior() {
		return new FlyNoWay();
	}

	public QuackBehavior getQuackBehavior() {
		return new MuteQuack();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is a wooden duck ...");
	}
}