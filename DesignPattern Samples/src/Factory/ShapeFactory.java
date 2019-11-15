package Factory;
import java.awt.Shape;

public class ShapeFactory {

	private ShapeFactory() {

	}

	public static IShape getShape(String shapeName) {
		switch (shapeName) {
		case "circle":
			return new Circle();
		case "square":
			return new Square();
		}
		return null;
	}
}
