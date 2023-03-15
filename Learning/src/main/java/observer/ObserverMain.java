package observer;

//Observations:

    //1. Observation of behavior occurs from within behavior of the observable object.

public class ObserverMain {

    public static void main(String[] args) {

        Button button = new Button();

        button.addListener(new ListenerA());
        button.addListener(() -> System.out.println("Logic 1"));
        button.addListener(() -> System.out.println("Logic 2"));

        button.click();
    }

}
