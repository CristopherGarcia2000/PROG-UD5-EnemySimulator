package net.salesianos.entidades.mobs.pacificos;

import net.salesianos.entidades.mobs.MobPacífico;

public class Oveja extends MobPacífico {
    public Oveja(int salud) {
        super(salud);
    }

    @Override
    protected void moverse() {
        System.out.println("Se mueve por el campo");
    }

}
