public class WoodenDuck extends Duck {
	
	public WoodenDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	public void displayDuck() {
		System.out.println("Display: This is a wooden duck ...");
	}
}