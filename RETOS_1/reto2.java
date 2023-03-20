import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ingreso de datos
        System.out.print("Ingrese el nombre de la mamá: ");
        String nombreMama = input.nextLine();
        
        System.out.print("Ingrese el peso del bebé en kg: ");
        double pesoBebe = input.nextDouble();
        
        System.out.print("Ingrese la cantidad de dosis de vacuna: ");
        int cantidadDosis = input.nextInt();
        input.nextLine(); // Consumir el salto de línea
        
        System.out.print("Ingrese el nombre del bebé: ");
        String nombreBebe = input.nextLine();
        
        System.out.print("Ingrese el nombre de la vacuna: ");
        String nombreVacuna = input.nextLine();
        
        // Cálculo de dosis
        double dosis = 0.5 * pesoBebe;
        double dosisTotal = dosis * cantidadDosis;
        
        // Impresión de resultados
        System.out.println("Nombre de la mamá: " + nombreMama);
        System.out.println("Nombre del bebé: " + nombreBebe);
        System.out.println("Peso del bebé: " + pesoBebe + " kg");
        System.out.println("Nombre de la vacuna: " + nombreVacuna);
        System.out.println("Cantidad de dosis: " + cantidadDosis);
        System.out.println("Dosis por cada vacuna: " + dosis + " ml");
        System.out.println("Dosis total: " + dosisTotal + " ml");
        input.close();
    }
}

