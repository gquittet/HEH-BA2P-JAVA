import java.util.ArrayList;
import java.util.List;

public class Document implements Subject {

    private List<Observer> observers;
    private String text;

    public Document() {
	observers = new ArrayList<Observer>();
	text = new String("");
    }

    @Override
    public void attach(Observer observer) {
	observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
	observers.remove(observer);
    }

    @Override
    public void notifie() {
	for (Observer observer : observers) {
	    observer.update();
	}
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }
}
