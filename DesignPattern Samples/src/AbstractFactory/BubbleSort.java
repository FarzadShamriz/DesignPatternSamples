package AbstractFactory;
import java.util.ArrayList;

public class BubbleSort<E> extends AbstractSort<E> implements ISort<E> {

	@Override
	public ArrayList<E> sort(ArrayList<E> list) {
		someHelpers();
		System.out.print("Bubble Sort.first one is " + list.get(0));
		return list;
	}

}
