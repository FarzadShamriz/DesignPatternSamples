package Strategy;

public class MainStrategy {

	public static void main(String[] args) {
		IStrategy addStrategy = new AddStrategy();
		Calculator calculator = new Calculator();
		calculator.setStrategy(addStrategy);
		System.out.println(calculator.calculateStrategy(4, 5));

	}

}
