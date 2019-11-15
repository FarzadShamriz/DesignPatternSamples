package Decorator;

public abstract class CoffeeDecorator implements ICoffee {

	protected final ICoffee decoratedCoffee;

	public CoffeeDecorator(ICoffee coffeeForDecorate) {
		this.decoratedCoffee = coffeeForDecorate;
	}

	@Override
	public double getCost() {
		return 1;
	}

	@Override
	public String getIngredients() {
		return "Coffee";
	}

}
