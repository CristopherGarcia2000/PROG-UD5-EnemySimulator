import net.salesianos.entidades.Personaje;
import net.salesianos.entidades.mobs.hostiles.Enderman;
import net.salesianos.entidades.mobs.hostiles.Zombie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fuerzaArma;
        int defensaArmadura;
        int opcion;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int accionAleatoria;
        int turnos = 0;

        System.out.println("Bienvenido");
        System.out.println("Seleccione un arma:\n" +
                "1.-Ninguna\n" +
                "2.-Espada de Madera\n" +
                "3.-Espada de Hierro\n" +
                "4.-Espada de Diamante");
        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Has seleccionado ir sin armas");
                fuerzaArma = 1;
                break;
            case 2:
                System.out.println("Has seleccionado la Espada de Madera");
                fuerzaArma = 2;
                break;
            case 3:
                System.out.println("Has seleccionado la Espada de Piedra");
                fuerzaArma = 3;
                break;
            case 4:
                System.out.println("Has seleccionado la Espada de Diamante");
                fuerzaArma = 5;
                break;
            default:
                System.out.println("No hay arma asociada a ese valor");
                fuerzaArma = 0;
                break;
        }
        System.out.println("Seleccione una armadura:\n" +
                "1.-Ninguna\n" +
                "2.-De Cuero\n" +
                "3.-De Hierro\n" +
                "4.-De Diamante");
        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Has seleccionado ir sin armadura");
                defensaArmadura = 0;
                break;
            case 2:
                System.out.println("Has seleccionado Armadura de Cuero");
                defensaArmadura = 1;
                break;
            case 3:
                System.out.println("Has seleccionado Armadura de Hierro");
                defensaArmadura = 2;
                break;
            case 4:
                System.out.println("Has seleccionado Armadura De Diamante");
                defensaArmadura = 3;
                break;
            default:
                System.out.println("No hay armadura asociada a ese valor");
                defensaArmadura = 0;
                break;
        }
        Personaje jugador = new Personaje(defensaArmadura,fuerzaArma);
        Zombie zombie = new Zombie(10,4);
        Enderman enderman = new Enderman(14,6);
        while (zombie.getSalud() > 0 && jugador.getSalud() > 0){
            System.out.println("Atacas al enemigo");
            zombie.recibirAtaque(jugador.atacar());
            accionAleatoria = random.nextInt(2);
            if (accionAleatoria == 0){
                jugador.recibirAtaque(zombie.atacar());
            }else {
                zombie.moverse();
            }
            turnos++;
        }
        System.out.println("Han pasado "+turnos+" turnos");
        if(jugador.getSalud() == 0){
            System.out.println("Ha ganado el zombie");
        }else {
            System.out.println("Has ganado");
        }
    }
}