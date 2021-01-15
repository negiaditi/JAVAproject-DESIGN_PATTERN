public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: TemplateMethod\n");

		//
		// Create ItalianPizza
		//

		Pizza customer1Pizza = new ItalianPizza();
		customer1Pizza.templateMethod();

		System.out.println("\n");

		//
		// Create VeggiePizza
		//

		Pizza customer2Pizza = new VeggiePizza();
		customer2Pizza.templateMethod();

	}

}
