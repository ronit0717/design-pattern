public class AmericanFlyingDuck extends Duck {
	
	public AmericanFlyingDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is an American flying duck ...");
	}
}