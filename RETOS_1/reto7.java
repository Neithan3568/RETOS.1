import java.util.Scanner;
import java.util.Random;

public class reto7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            
            // Generar un número aleatorio del 1 al 100
            int numeroAdivinar = random.nextInt(100) + 1;
            
            int intentos = 0;
            int numeroElegido;
            
            System.out.println("¡Bienvenido al juego de adivinar el número! ");
            System.out.println("Tienes 10 intentos para adivinar un número entre 1 y 100.");
            
            // Pedir al usuario que ingrese un número y responder si es mayor o menor
            while (intentos < 10) {
                System.out.print("Intento #" + (intentos + 1) + ": ");
                numeroElegido = input.nextInt();
                
                if (numeroElegido == numeroAdivinar) {
                    System.out.println("¡Felicitaciones, adivinaste el número en " + (intentos + 1) + " intentos!");
                    return; // Terminar el programa
                } else if (numeroElegido < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
                
                intentos++;
            }
            
            System.out.println("Lo siento, no lograste adivinar el número. El número era " + numeroAdivinar + ".");
        }
    }
}
