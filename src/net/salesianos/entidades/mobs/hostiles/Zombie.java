package net.salesianos.entidades.mobs.hostiles;

import net.salesianos.entidades.mobs.MobHostil;

public class Zombie extends MobHostil {
    public Zombie(int salud, int fuerza) {
        super(salud, fuerza);
    }

    @Override
    protected void moverse() {
        System.out.println("Se mueve hacia ti");
    }
}
