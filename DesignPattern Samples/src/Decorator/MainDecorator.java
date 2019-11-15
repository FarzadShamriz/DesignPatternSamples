package Decorator;

public class MainDecorator {

	public static void main(String[] args) {
		ICoffee coffee = new SimpleCoffee();
		System.out.print("Simple Coffee. Cost = " + coffee.getCost() + ". Ingredients = " + coffee.getIngredients());
		System.out.println();

		Milk milk = new Milk(coffee);
		System.out.print("Milk Coffee. Cost = " + milk.getCost() + ". Ingredients = " + milk.getIngredients());

		coffee = new Espresso();
		System.out.print("Simple Coffee. Cost = " + coffee.getCost() + ". Ingredients = " + coffee.getIngredients());
		System.out.println();

		milk = new Milk(coffee);
		System.out.print("Milk Coffee. Cost = " + milk.getCost() + ". Ingredients = " + milk.getIngredients());

	}

}
