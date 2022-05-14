public class IndianHomeDuck extends Duck {
	public FlyBehavior getFlyBehavior() {
		return new FlyNoWay();
	}

	public QuackBehavior getQuackBehavior() {
		return new Quack();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is an Indian home duck ...");
	}
}