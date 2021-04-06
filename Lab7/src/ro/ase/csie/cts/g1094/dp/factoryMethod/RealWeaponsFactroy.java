package ro.ase.csie.cts.g1094.dp.factoryMethod;

import ro.ase.csie.cts.g1094.dp.simpleFactory.*;

public class RealWeaponsFactroy extends AbstractFactory{
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String description) {
        AbstractWeapon weapon = null;
        switch (type){
            case PISTOL:
                weapon = new Pistol(description, 100);
                break;
            case MACHINE_GUN:
                weapon = new MachineGun(500,1000);
                break;
            case BAZOOKA:
                weapon = new Bazooka();
                weapon.setDescription(description);
                break;
            default:
                throw new UnsupportedOperationException("Type not covered");
        }

        return weapon;
    }
}
