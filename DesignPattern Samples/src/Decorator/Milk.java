package Decorator;

public class Milk extends CoffeeDecorator {

	public Milk(ICoffee coffeeForDecorate) {
		super(coffeeForDecorate);
	}

	@Override
	public double getCost() {
		return super.getCost() + 1;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + " and Milk";
	}

}
