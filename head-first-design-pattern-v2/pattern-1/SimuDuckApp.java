public class SimuDuckApp {
	public static void main(String[] args) {
		System.out.println("Starting SimuDuckApp...");

		Duck duck1 = new IndianHomeDuck();
		duck1.displayDuck();
		duck1.getHasWings();
		duck1.getNumberOfLegs();
		duck1.getFlyBehavior().fly();
		duck1.getQuackBehavior().quack();
		System.out.println();

		Duck duck2 = new AmericanFlyingDuck();
		duck2.displayDuck();
		duck2.getHasWings();
		duck2.getNumberOfLegs();
		duck2.getFlyBehavior().fly();
		duck2.getQuackBehavior().quack();
		System.out.println();

		Duck duck3 = new RubberDuck();
		duck3.displayDuck();
		duck3.getHasWings();
		duck3.getNumberOfLegs();
		duck3.getFlyBehavior().fly();
		duck3.getQuackBehavior().quack();
		System.out.println();

		Duck duck4 = new WoodenDuck();
		duck4.displayDuck();
		duck4.getHasWings();
		duck4.getNumberOfLegs();
		duck4.getFlyBehavior().fly();
		duck4.getQuackBehavior().quack();
		System.out.println();

		System.out.println("Ending SimuDuckApp...");
	}
}