package observer;

import java.util.ArrayList;
import java.util.List;


//Observable class:
public class Button {

    private List<EventListener> eventListeners;

    public void addListener(EventListener listener) {
        eventListeners.add(listener);
    }

    public Button() {
        this.eventListeners = new ArrayList<>();
    }

    public void click() {
        System.out.println("Clicked");
        eventListeners.forEach(EventListener::listen);
    }
}
