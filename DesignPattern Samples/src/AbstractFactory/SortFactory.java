package AbstractFactory;
public class SortFactory {

	private static class SortFactoryInstanceHolder {
		private static SortFactory instance = new SortFactory();
	}

	public SortFactory getInstance() {
		return SortFactoryInstanceHolder.instance;
	}

	private SortFactory() {

	}

	public static ISort<Integer> getSortAlgorythm(String algorythmName) {
		switch (algorythmName) {
		case "insert":
			return new InsertationSort<>();
		default:
			return new BubbleSort<>();
		}
	}
}
