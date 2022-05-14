public class IndianHomeDuck extends Duck {

	public IndianHomeDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is an Indian home duck ...");
	}
}