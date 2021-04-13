package ro.ase.csie.cts.g1094.dp.adapter;

public class FantasyHero extends ACMESuperHero{

    boolean canFly = false;

    public FantasyHero(String name, int lifePoints, boolean canFly) {
        super(name, lifePoints);
        this.canFly = canFly;
    }

    @Override
    public void move() {
        if(this.canFly){
            System.out.println("is flying");
        }
        else
        {
            System.out.println("is running");
        }
    }

    @Override
    public void crouch() {
        System.out.println("is crouching");
    }

    @Override
    public void takeAHit(int point) {
        System.out.println(String.format("%s takes a hit of %d points",name,point));
        this.lifePoints -= point;
    }

    @Override
    public void heal(int points) {
        System.out.println(String.format("%s heals for %d points",name,points));
        this.lifePoints += points;
    }
}
