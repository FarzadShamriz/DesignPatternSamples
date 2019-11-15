package Observer;
import java.util.ArrayList;

public class Subject1 implements ISubject {

	ArrayList<IObserver> observerList = new ArrayList<IObserver>();
	private int state;

	@Override
	public void Attach(IObserver o) {
		observerList.add(o);
	}

	@Override
	public void Detach(IObserver o) {
		observerList.remove(o);
	}

	@Override
	public void Notify(int stateValue) {
		for (IObserver observerItem : observerList) {
			observerItem.Update(stateValue);
		}
	}

	public void setState(int stateValue) {
		this.state = stateValue;
		Notify(this.state);
	}

}
