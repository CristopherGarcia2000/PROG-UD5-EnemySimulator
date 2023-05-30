package net.salesianos.entidades;

import net.salesianos.interfaces.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public int getSalud() {
        return salud;
    }

    public int getDefensa() {
        return defensa;
    }



    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int dañoRecibido = ataque-this.defensa;
        this.salud = this.salud -dañoRecibido;
        System.out.println("Has recibido "+dañoRecibido+" puntos de daño, te quedan "+this.salud+" de vida");
    }
}
