package ro.ase.csie.cts.g1094.dp.builder;

public class SuperHero {

    String name;
    int lifePoints;
    boolean isVillain;
    boolean isWounded;

    WeaponInterface leftWeapon;
    WeaponInterface rightWeapon;

    String superPower;
    String superSuperPower;

    private SuperHero() {
    }

    private SuperHero(String name, int lifePoints, boolean isVillain, boolean isWounded, WeaponInterface leftWeapon, WeaponInterface rightWeapon, String superPower, String superSuperPower) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.isVillain = isVillain;
        this.isWounded = isWounded;
        this.leftWeapon = leftWeapon;
        this.rightWeapon = rightWeapon;
        this.superPower = superPower;
        this.superSuperPower = superSuperPower;

    }

    public static class SuperHeroBuilder {
        private SuperHero superHero = null;

        public SuperHeroBuilder(String name, int lifePoints)
        {
            superHero = new SuperHero();
            superHero.name = name;
            superHero.lifePoints = lifePoints;
        }

        public  SuperHeroBuilder isVillain(){
            superHero.isVillain = true;
            return this;
        }

        public SuperHeroBuilder isWounded(){
            superHero.isWounded = true;
            return  this;
        }

        public SuperHeroBuilder addLeftWeapon(WeaponInterface weapon){
            superHero.leftWeapon = weapon;
            return  this;
        }


        public SuperHeroBuilder addRightWeapon(WeaponInterface weapon){
            superHero.rightWeapon = weapon;
            return  this;
        }

        public SuperHeroBuilder addSuperPower(String superPower){
            superHero.superPower = superPower;
            return this;
        }


        public SuperHeroBuilder addSuperSuperPower(String superPower){
            superHero.superSuperPower = superPower;
            return this;
        }

        //don't forget it
        public SuperHero build() {
            return this.superHero;
        }

    }


}
