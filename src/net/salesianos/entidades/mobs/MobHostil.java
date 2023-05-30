package net.salesianos.entidades.mobs;

import net.salesianos.entidades.Mob;
import net.salesianos.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    protected int fuerza;
    public MobHostil(int salud,int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }


    @Override
    public int atacar() {
        return this.fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        this.salud = this.salud - ataque;
        System.out.println("Ha recibido "+ataque+" puntos de daño, le quedan "+salud+" puntos de salud");
    }
}
