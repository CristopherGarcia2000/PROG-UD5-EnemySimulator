package net.salesianos.entidades.mobs;

import net.salesianos.entidades.Mob;
import net.salesianos.interfaces.Combate;

public abstract class MobPacífico extends Mob implements Combate {

    public MobPacífico(int salud) {
        super(salud);
    }

    @Override
    public void recibirAtaque(int ataque) {
        this.salud = this.salud - ataque;
    }
}
