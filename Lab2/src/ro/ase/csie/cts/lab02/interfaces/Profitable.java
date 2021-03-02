package ro.ase.csie.cts.lab02.interfaces;

public interface Profitable {
    public static final float MAX_INTEREST_PERCENT = 5;		// ~ 5%
    public abstract void AddInterest(float interestPercent);
}
