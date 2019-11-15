package Decorator;

public class Espresso implements ICoffee {

	@Override
	public double getCost() {
		return 2;
	}

	@Override
	public String getIngredients() {
		return "Strong Coffee";
	}

}
