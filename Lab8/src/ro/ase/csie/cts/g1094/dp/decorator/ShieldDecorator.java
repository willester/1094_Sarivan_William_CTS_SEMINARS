package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperHero;



public class ShieldDecorator extends AbstracDecorator{

    int shieldPoints;

    public ShieldDecorator(ACMESuperHero hero, int shieldPoints) {
        super(hero);
        this.shieldPoints = shieldPoints;
    }

    @Override
    public void takeAHit(int point) {
        int lostPoints = point - shieldPoints;
        if(lostPoints > 0)
        {
            this.hero.takeAHit(lostPoints);
        }

    }
}
