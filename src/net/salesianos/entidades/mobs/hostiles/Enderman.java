package net.salesianos.entidades.mobs.hostiles;

import net.salesianos.entidades.mobs.MobHostil;

public class Enderman extends MobHostil {
    public Enderman(int salud, int fuerza) {
        super(salud, fuerza);
    }

    @Override
    protected void moverse() {
        System.out.println("Se teletransporta detrás de ti");
    }
}
