package Observer;

public class Observer1 implements IObserver {

	String observerName;

	public Observer1(String oName) {
		this.observerName = oName;
	}

	@Override
	public void Update(int stateValue) {
		System.out.println(
				observerName + " has received an alert: Someone has updated myValue in Subject to: " + stateValue);
	}

}
