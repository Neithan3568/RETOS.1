import java.util.Scanner;
import java.util.Random;

public class reto8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            
            int dineroAcumulado = 0;
            int cantidadJuegos = 0;
            int intentosPerdidos = 0;
            int apuesta;
            
            System.out.println("¡Bienvenido al juego de piedra, papel o tijera contra la máquina! ");
            System.out.println("Ingrese la cantidad de dinero que desea apostar: ");
            apuesta = input.nextInt();
            
            while (intentosPerdidos < 3) { // Permitir hasta tres intentos perdidos
                cantidadJuegos++;
                System.out.println("Juego #" + cantidadJuegos + ":");
                System.out.println("Seleccione su jugada: 1. Piedra, 2. Papel, 3. Tijera");
                int jugadaUsuario = input.nextInt();
                
                // Validar la entrada del usuario
                while (jugadaUsuario < 1 || jugadaUsuario > 3) {
                    System.out.println("Jugada inválida. Seleccione su jugada: 1. Piedra, 2. Papel, 3. Tijera");
                    jugadaUsuario = input.nextInt();
                }
                
                // Convertir la jugada del usuario en texto para mostrar en pantalla
                String jugadaUsuarioTexto;
                if (jugadaUsuario == 1) {
                    jugadaUsuarioTexto = "Piedra";
                } else if (jugadaUsuario == 2) {
                    jugadaUsuarioTexto = "Papel";
                } else {
                    jugadaUsuarioTexto = "Tijera";
                }
                
                // Generar la jugada de la máquina de manera aleatoria
                int jugadaMaquina = random.nextInt(3) + 1;
                String jugadaMaquinaTexto;
                if (jugadaMaquina == 1) {
                    jugadaMaquinaTexto = "Piedra";
                } else if (jugadaMaquina == 2) {
                    jugadaMaquinaTexto = "Papel";
                } else {
                    jugadaMaquinaTexto = "Tijera";
                }
                
                // Determinar el resultado del juego
                String resultado = "";
                if (jugadaUsuario == jugadaMaquina) {
                    resultado = "Empate";
                } else if (jugadaUsuario == 1 && jugadaMaquina == 3 || jugadaUsuario == 2 && jugadaMaquina == 1 || jugadaUsuario == 3 && jugadaMaquina == 2) {
                    resultado = "Ganaste";
                    dineroAcumulado += apuesta;
                } else {
                    resultado = "Perdiste";
                    dineroAcumulado -= apuesta;
                }
                
                // Mostrar en pantalla la jugada del usuario, la jugada de la máquina y el resultado del juego
                System.out.println("Jugada del usuario: " + jugadaUsuarioTexto);
                System.out.println("Jugada de la máquina: " + jugadaMaquinaTexto);
                System.out.println("Resultado: " + resultado);
                System.out.println("Dinero acumulado: $" + dineroAcumulado);
                
                if (dineroAcumulado < 0) {
                    System.out.println("Lo siento, has perdido todo tu dinero acumulado.");
                    return; // Terminar el programa
                }
            }
        }
    }
}

