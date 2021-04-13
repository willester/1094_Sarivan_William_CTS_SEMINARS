package ro.ase.csie.cts.g1094.dp.adapter;

import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args) {
        ACMESuperHero blueDragon = new FantasyHero("Blue dragon", 1000,true);
        blueDragon.move();
        blueDragon.takeAHit(500);
        blueDragon.heal(250);


        DisneyActions donald = new DonalDDuck(100);
        donald.changeLocation(100,100);
        donald.isWounded(50);
        donald.restorePOwer(25);

        ArrayList<ACMESuperHero> heroes = new ArrayList<>();
        heroes.add(blueDragon);
        Disney2AcmeAdapter adapter = new Disney2AcmeAdapter(donald);
        heroes.add(adapter);

        for(ACMESuperHero hero: heroes){
            hero.move();
            hero.takeAHit(50);
            hero.heal(40);
        }


    }


}
