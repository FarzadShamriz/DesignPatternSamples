package Decorator;

public class SimpleCoffee implements ICoffee {
	@Override
	public double getCost() {
		return 1;
	}

	@Override
	public String getIngredients() {
		return "Coffee";
	}
}
