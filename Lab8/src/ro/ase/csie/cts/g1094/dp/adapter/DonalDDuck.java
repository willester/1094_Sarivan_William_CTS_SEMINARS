package ro.ase.csie.cts.g1094.dp.adapter;

public class DonalDDuck implements DisneyActions{

    public final String name = "Donal duck";
    int powerLevel;

    public DonalDDuck(int powerLevel) {
        super();
        this.powerLevel = powerLevel;
    }

    @Override
    public void changeLocation(int x, int y) {
        System.out.println("move a new location");
    }

    @Override
    public void isWounded(int power) {
        powerLevel -= power;
        System.out.println("power decreatd to " + powerLevel);
    }

    @Override
    public void restorePOwer(int power) {
        powerLevel += power;
        System.out.println("power incresed to " + powerLevel);
    }
}
