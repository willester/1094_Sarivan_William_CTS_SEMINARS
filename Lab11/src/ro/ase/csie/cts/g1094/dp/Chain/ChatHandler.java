package ro.ase.csie.cts.g1094.dp.Chain;

public abstract class ChatHandler {

    ChatHandler next;


    public void setNext(ChatHandler next) {
        this.next = next;
    }

    public abstract void processMessage(Message msg);

}
