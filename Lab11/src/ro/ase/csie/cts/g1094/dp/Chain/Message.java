package ro.ase.csie.cts.g1094.dp.Chain;

public class Message {
    String destination;
    String text;
    int priority;

    public Message(String destination, String text, int priority) {
        this.destination = destination;
        this.text = text;
        this.priority = priority;
    }
}
