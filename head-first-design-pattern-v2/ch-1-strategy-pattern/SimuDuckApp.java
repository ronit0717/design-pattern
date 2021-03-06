public class SimuDuckApp {
	public static void main(String[] args) {
		System.out.println("Starting SimuDuckApp...\n");

		Duck duck1 = new IndianHomeDuck();
		duck1.displayDuck();
		duck1.getHasWings();
		duck1.getNumberOfLegs();
		duck1.performFlyBehavior();
		duck1.performQuackBehavior();
		System.out.println();

		Duck duck2 = new AmericanFlyingDuck();
		duck2.displayDuck();
		duck2.getHasWings();
		duck2.getNumberOfLegs();
		duck2.performFlyBehavior();
		duck2.performQuackBehavior();
		System.out.println();

		Duck duck3 = new RubberDuck();
		duck3.displayDuck();
		duck3.getHasWings();
		duck3.getNumberOfLegs();
		duck3.performFlyBehavior();
		duck3.performQuackBehavior();
		System.out.println();

		Duck duck4 = new WoodenDuck();
		duck4.displayDuck();
		duck4.getHasWings();
		duck4.getNumberOfLegs();
		duck4.performFlyBehavior();
		duck4.performQuackBehavior();
		System.out.println();

		//run time behavior change example
		Duck duck5 = new ModelDuck();
		duck5.displayDuck();
		duck5.getHasWings();
		duck5.getNumberOfLegs();
		duck5.performFlyBehavior();
		duck5.performQuackBehavior();
		System.out.println("Changing runtime behavior");

		FlyBehavior fb = new FlyWithRocket();
		duck5.setFlyBehavior(fb);
		duck5.performFlyBehavior();
		System.out.println();		

		System.out.println("Ending SimuDuckApp...");
	}
}