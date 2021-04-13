package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperHero;
import ro.ase.csie.cts.g1094.dp.adapter.FantasyHero;

public class TestDecorator {

    public static void main(String[] args) {

        ACMESuperHero blueDragon = new FantasyHero("Blue dragon", 1000,true);
        blueDragon.move();
        blueDragon.takeAHit(500);
        blueDragon.heal(250);

       // ACMESuperHero blueDragonShield = new ShieldDecorator(blueDragon,300);
        blueDragon = new ShieldDecorator(blueDragon,300);
        blueDragon.takeAHit(500);

        blueDragon = new WoundedDecorator(blueDragon);
        blueDragon.move();



    }




}
