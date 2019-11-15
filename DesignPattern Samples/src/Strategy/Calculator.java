package Strategy;

class Calculator {
	private IStrategy strategy;

	public void setStrategy(IStrategy newStrategy) {
		this.strategy = newStrategy;
	}

	public int calculateStrategy(int a, int b) {
		return this.strategy.execute(a, b);
	}
}
