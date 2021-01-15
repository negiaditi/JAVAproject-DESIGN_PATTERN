
public class VeggiePizza extends Pizza {

	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Pappers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	

	boolean customerWantsMeat() {
		return false; //false
	}

	boolean customerWantsCheese() {
		return false; //false
	}

	//
	//
	//

	@Override
	void addMeat() {


	}

	@Override
	void addCheese() {

		

	}

	@Override
	void addVegetables() {
		System.out.println("\n");
		System.out.println("Adding the veggies: ");

		for (String veggie : veggiesUsed) {
			System.out.println(veggie + " ");
		}

	}

	@Override
	void addCondiments() {
		System.out.println("\n");
		System.out.println("Adding the condiments: ");

		for (String condiment : condimentsUsed) {
			System.out.println(condiment + " ");
		}

	}

}
