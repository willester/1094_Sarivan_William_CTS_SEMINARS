package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperHero;

public abstract class AbstracDecorator extends ACMESuperHero {

    ACMESuperHero hero = null;

    public AbstracDecorator(ACMESuperHero hero) {
       super(hero.name, hero.lifePoints);
       this.hero = hero;
    }

    @Override
    public void move() {
        this.hero.move();
    }

    @Override
    public void crouch() {
        this.hero.crouch();
    }

    @Override
    public void takeAHit(int point) {
    this.hero.takeAHit(point);
    }

    @Override
    public void heal(int points) {
    this.hero.heal(points);
    }


}
