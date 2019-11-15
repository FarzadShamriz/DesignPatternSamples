package Visitor;

public class PostageVisitor implements Visitor {
	private double totalPostagePrice;

	public void visit(Book book) {
		double bookWeight = book.getBookWeight();
		double bookPrice = book.getBookPrice();
		if (bookWeight < 10) {
			totalPostagePrice += (bookPrice * 2);
		} else
			totalPostagePrice += bookPrice;
	}

	public double getTotalPostagePrice() {
		return totalPostagePrice;
	}
}
