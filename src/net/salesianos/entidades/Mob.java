package net.salesianos.entidades;

public abstract class Mob {
    protected int salud;

    public Mob(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    protected abstract void moverse();
}
