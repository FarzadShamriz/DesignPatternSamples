package Visitor;
public class Book implements Visitable {
	private double bookPrice;
	private double bookWeight;

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getBookPrice() {
		return this.bookPrice;
	}

	public double getBookWeight() {
		return this.bookWeight;
	}
}
