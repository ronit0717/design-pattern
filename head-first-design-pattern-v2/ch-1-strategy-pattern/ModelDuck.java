public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	
	public void displayDuck() {
		System.out.println("Display: This is a model duck ...");
	}


}