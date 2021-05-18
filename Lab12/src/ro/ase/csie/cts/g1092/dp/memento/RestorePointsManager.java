package ro.ase.csie.cts.g1092.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class RestorePointsManager {

    List<HeroRestorePoint> restorePoints = new ArrayList<>();

    public void addRestorePoints(HeroRestorePoint point){
        this.restorePoints.add(point);
    }

    public HeroRestorePoint getRestorePoints(int index) {
        if (index < 0 || index >= restorePoints.size()) {
            throw new UnsupportedOperationException();
        }
        else {
                HeroRestorePoint point = restorePoints.get(index);
                restorePoints.remove(index);
                return point;
        }
    }

}
