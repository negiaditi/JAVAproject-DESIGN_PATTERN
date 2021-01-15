public class ItalianPizza extends Pizza {

	String[] meatUsed = { "Pork", "Pepperoni", "Chicken" };
	String[] cheeseUsed = { "Mozzarella" };
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Babycorn","Broccoli", "Olives","Red Paprika", "Onions" };
	String[] condimentsUsed = { "Oil", "Vinegar","Butter"};

	@Override
	void addMeat() {

		System.out.println("Adding the meat: ");

		for (String meat : meatUsed) {
			System.out.println(meat + " ");
		}

	}

	@Override
	void addCheese() {

		System.out.println("Adding the cheese: ");

		for (String cheese : cheeseUsed) {
			System.out.println(cheese + " ");
		}

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
