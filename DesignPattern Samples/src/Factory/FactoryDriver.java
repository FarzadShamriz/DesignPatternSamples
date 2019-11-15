package Factory;

public class FactoryDriver {

	public static void main(String[] args) {
		IShape shape = ShapeFactory.getShape("circle");
		shape.draw();
		System.out.println();
		shape = ShapeFactory.getShape("square");
		shape.draw();
	}

}
