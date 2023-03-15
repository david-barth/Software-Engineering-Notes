package observer;


public class ListenerA implements EventListener {

    @Override
    public void listen() {
        System.out.println("Doing something in response to click");
    }

}
