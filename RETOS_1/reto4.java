import java.util.Scanner;
import java.util.Random;

public class JuegoPiedraPapelTijera {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Pidiendo al usuario ingresar su nombre y el valor de su apuesta
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese el valor de su apuesta (debe ser mayor a 10.000): ");
        int apuesta = input.nextInt();
        
        // Verificando que la apuesta sea mayor a 10.000
        if (apuesta < 10000) {
            System.out.println("La apuesta debe ser mayor a 10.000, no puedes jugar.");
            return;
        }
        
        // Pidiendo al usuario escoger entre piedra, papel o tijera
        input.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Escoja entre P (piedra), T (tijera) o Pa (papel): ");
        String opcionUsuario = input.nextLine().toLowerCase();
        
        // Generando la opción aleatoria de la computadora
        int opcionComputadora = random.nextInt(3); // 0 = piedra, 1 = tijera, 2 = papel
        
        // Mostrando la opción elegida por el usuario y la computadora
        System.out.println("Usted eligió: " + opcionUsuario);
        if (opcionComputadora == 0) {
            System.out.println("La computadora eligió: piedra");
        } else if (opcionComputadora == 1) {
            System.out.println("La computadora eligió: tijera");
        } else {
            System.out.println("La computadora eligió: papel");
        }
        
        // Evaluando el resultado del juego
        if (opcionUsuario.equals("p") && opcionComputadora == 1 ||
            opcionUsuario.equals("t") && opcionComputadora == 2 ||
            opcionUsuario.equals("pa") && opcionComputadora == 0) {
            // El usuario ganó
            int dineroGanado = apuesta * 2;
            System.out.println(nombre + " ganó! Ha ganado " + dineroGanado + " pesos.");
        } else if (opcionUsuario.equals("p") && opcionComputadora == 2 ||
                   opcionUsuario.equals("t") && opcionComputadora == 0 ||
                   opcionUsuario.equals("pa") && opcionComputadora == 1) {
            // La computadora ganó
            System.out.println("La computadora ganó. " + nombre + " perdió " + apuesta + " pesos.");
        } else {
            // Empate
            System.out.println("¡Empate!");
        }
    }

}
