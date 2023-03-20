import java.util.Random;
import java.util.Scanner;

public class reto6 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random();
            
            // Pidiendo al usuario ingresar su nombre
            System.out.print("Ingrese su nombre: ");
            // Pidiendo al usuario ingresar la cantidad de dinero que quiere apostar
            System.out.print("Ingrese la cantidad de dinero que quiere apostar: ");
            double dineroAcumulado = input.nextDouble();
            
            // Jugando el juego
            int jugadas = 0;
            boolean seguirJugando = true;
            while (seguirJugando) {
                // Pidiendo al usuario ingresar su elección (1=ganar, 0=perder)
                System.out.print("¿Quiere ganar (1) o perder (0)?: ");
                int eleccionUsuario = input.nextInt();
                
                // Generando la elección de la máquina (1=ganar, 0=perder)
                int eleccionMaquina = rand.nextInt(2);
                
                // Verificando el resultado del juego y actualizando el dinero acumulado
                if (eleccionUsuario == eleccionMaquina) {
                    // El usuario ganó
                    System.out.println("¡Ganó el jugador!");
                    dineroAcumulado += 100;
                } else {
                    // El usuario perdió
                    System.out.println("¡Ganó la máquina!");
                    dineroAcumulado -= 50;
                }
                
                // Pidiendo al usuario si quiere seguir jugando
                System.out.print("¿Quiere seguir jugando? (s/n): ");
                String respuesta = input.next().toLowerCase();
                if (respuesta.equals("s")) {
                    seguirJugando = true;
                    jugadas++;
                } else if (respuesta.equals("n")) {
                    seguirJugando = false;
                } else {
                    System.out.println("Respuesta inválida.");
                }
            }
            
            // Mostrando el resultado final del juego
            System.out.println("Cantidad de veces que jugó: " + jugadas);
            System.out.println("Dinero acumulado: " + dineroAcumulado);
            if (dineroAcumulado > 0) {
                System.out.println("¡Ganó el jugador!");
            } else {
                System.out.println("Ganó la máquina.");
            }
        }
    }

}


