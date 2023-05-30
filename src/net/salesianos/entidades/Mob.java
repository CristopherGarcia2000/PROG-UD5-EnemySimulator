package net.salesianos.entidades;

public abstract class Mob {
    private int salud;

    public Mob(int salud) {
        this.salud = salud;
    }

    protected abstract void moverse();
}
