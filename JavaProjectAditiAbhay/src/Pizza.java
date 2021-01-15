public abstract class Pizza {

	//
	// TemplateMethod
	

	final void templateMethod() {

		cutBase();



		if (customerWantsMeat()) {
			addMeat();
		}

		if (customerWantsCheese()) {
			addCheese();
		}

		if (customerWantsVegetables()) {
			addVegetables();
		}

		if (customerWantsCondiments()) {
			addCondiments();
		}

			packThePizza();

	}

	public void cutBase() {
		System.out.println("The Pizza is cut into slices");
	}

	public void packThePizza() {
		System.out.println("Pack the Pizza");
	}

	abstract void addMeat();

	abstract void addCheese();

	abstract void addVegetables();

	abstract void addCondiments();


	boolean customerWantsMeat() {
		return true;
	}

	boolean customerWantsCheese() {
		return true;
	}

	boolean customerWantsVegetables() {
		return true;
	}

	boolean customerWantsCondiments() {
		return true;
	}

}
