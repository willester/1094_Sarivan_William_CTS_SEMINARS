package ro.ase.csie.cts.g1092.dp.observer;

public class UINotificationModule implements NetworkEvenHandlerInterface{

    @Override
    public void notifyNetworkDown() {
        System.out.println("Notify player: Network lost");
    }

    @Override
    public void notifyNetworkUp() {
        System.out.println("Notify player: Connection up");
    }

}
