package Visitor;
import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Visitable> items;
	
	public double calculatePostage() {
		PostageVisitor visitor = new PostageVisitor();
		
		for(Visitable item : items) {
			item.accept(visitor);
		}
		
		double postage = visitor.getTotalPostagePrice();
		return postage;
	}
}
