package AbstractFactory;

import java.util.ArrayList;

abstract class AbstractSort<E> {

	public abstract ArrayList<E> sort(ArrayList<E> list);

	protected void someHelpers() {
		System.out.print("execute AbstractSort");
	}

}
