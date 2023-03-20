import java.util.Scanner;
import java.util.Random;

public class reto3 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Random rand = new Random();
            
            System.out.print("Ingresa tu nombre: ");
            String nombre = entrada.nextLine();
            
            System.out.print("Ingresa tu apuesta (debe ser mayor a 10,000): ");
            int apuesta = entrada.nextInt();
            
            if (apuesta < 10000) {
                System.out.println("Lo siento, tu apuesta debe ser mayor a 10,000. Adiós.");
                return;
            }
            
            int resultado = rand.nextInt(2); // 0 para cara, 1 para sello
            String opcionResultado = (resultado == 0) ? "cara" : "sello";
            int dineroGanado = (opcionResultado.equals("cara")) ? apuesta : -apuesta;
            
            System.out.println("El resultado es " + opcionResultado);
            
            if (dineroGanado > 0) {
                System.out.println("¡Felicitaciones " + nombre + "! Ganaste " + dineroGanado + " pesos.");
            } else if (dineroGanado < 0) {
                System.out.println("Lo siento " + nombre + ", perdiste " + (-dineroGanado) + " pesos.");
            } else {
                System.out.println("Empate. No ganas ni pierdes dinero.");
            }
        }
    }
}