package net.salesianos.entidades.mobs;

import net.salesianos.entidades.Mob;
import net.salesianos.interfaces.Daño;

public abstract class MobPacífico extends Mob implements Daño {

    public MobPacífico(int salud) {
        super(salud);
    }

    @Override
    public void recibirAtaque(int ataque) {
        this.salud = this.salud - ataque;
    }
}
