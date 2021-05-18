package ro.ase.csie.cts.g1092.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkModule {

    List<NetworkEvenHandlerInterface> modules = new ArrayList<>();

    public void registerModule(NetworkEvenHandlerInterface module){
        modules.add(module);
    }

    public void unregisterModule(NetworkEvenHandlerInterface module){
        modules.remove(module);
    }

    public void networkStatusChanged(NetworkStatus status) {
        if (status == NetworkStatus.UP) {
            for (NetworkEvenHandlerInterface module : modules) {
                module.notifyNetworkUp();
            }
        } else {
            for (NetworkEvenHandlerInterface module : modules) {
                module.notifyNetworkDown();
            }
        }
    }


}
