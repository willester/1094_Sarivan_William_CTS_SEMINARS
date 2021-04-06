package ro.ase.csie.cts.g1094.dp.factoryMethod;

import ro.ase.csie.cts.g1094.dp.simpleFactory.SuperHero;
import ro.ase.csie.cts.g1094.dp.simpleFactory.WeaponType;
import ro.ase.csie.cts.g1094.dp.simpleFactory.WeaponsFactory;

public class TestFactory {

    public static void main(String[] args) {

        boolean kidsMode = true;
        SuperHero superman = null;

        if(kidsMode){
             superman = new SuperHero("Superman",new WaterPistol());
        }
        else{
            superman = new SuperHero("Superman", WeaponsFactory.getWeapon(WeaponType.PISTOL,""));
        }

        //with factory method

        AbstractFactory weaponFactory = (kidsMode == true) ? new WaterWeaponsFactory() : new RealWeaponsFactroy();
        superman = new SuperHero("superman",weaponFactory.getWeapon(WeaponType.PISTOL,"s"));
        superman.setWeapon(weaponFactory.getWeapon(WeaponType.BAZOOKA,""));



    }

}
