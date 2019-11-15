package Observer;

public class MainMethod {

	public static void main(String[] args) {
		IObserver myObserver1 = new Observer1("Roy");
		IObserver myObserver2 = new Observer1("Kevin");
		IObserver myObserver3 = new Observer1("Bose");
		Subject1 subject = new Subject1();

		subject.Attach(myObserver1);
		subject.Attach(myObserver2);
		subject.Attach(myObserver3);

		subject.setState(3);
	}

}
