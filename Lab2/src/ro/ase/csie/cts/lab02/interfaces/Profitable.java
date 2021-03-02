package ro.ase.csie.cts.lab02.interfaces;

public interface Profitable {
    public static final double MAX_INTEREST_PERCENT = 5;
    public abstract void AddInterest(float interestPercent);
}
