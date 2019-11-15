package AbstractFactory;
import java.util.ArrayList;

public class MainSort {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		final ISort<Integer> mySortAlgorythm = SortFactory.getSortAlgorythm("insert");
		mySortAlgorythm.sort(myList);
	}

}
