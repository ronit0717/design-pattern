public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is a rubber duck ...");
	}
}