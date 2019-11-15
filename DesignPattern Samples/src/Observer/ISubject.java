package Observer;

interface ISubject {
	void Attach(IObserver o);

	void Detach(IObserver o);

	void Notify(int stateValue);
}
