package mailbox;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> l;
	
	public Subject () {
		l = new ArrayList<Observer>();
	}
	
	public void attach(Observer o) {
		l.add(o);
	}
	
	public void detach() {
		l.clear();
	}
	
	public void notifyObservers() {
		for(Observer o : l) {
			o.update(this);
		}
	}
}
