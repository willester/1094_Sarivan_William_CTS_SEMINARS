package ro.ase.csie.cts.g1094.dp.adapter;

public interface DisneyActions {

    public String getName();
    public int getPower();


    public void changeLocation(int x, int y);
    public void isWounded(int power);
    public void restorePOwer(int power);


}
