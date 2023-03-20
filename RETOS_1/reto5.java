import java.util.Scanner;

public class reto5 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Pidiendo al usuario ingresar el nombre del empleado
            System.out.print("Ingrese el nombre del empleado: ");
            // Pidiendo al usuario ingresar el nombre del cliente
            System.out.print("Ingrese el nombre del cliente: ");
            // Verificando si el cliente está registrado o no
            boolean clienteRegistrado = false;
            while (!clienteRegistrado) {
                System.out.print("¿El cliente está registrado? (s/n): ");
                String respuesta = input.nextLine().toLowerCase();
                if (respuesta.equals("s")) {
                    clienteRegistrado = true;
                } else if (respuesta.equals("n")) {
                    System.out.println("El cliente debe ser registrado antes de hacer la compra.");
                    System.out.print("Ingrese el nombre del cliente: ");
                } else {
                    System.out.println("Respuesta inválida.");
                }
            }
            
            // Pidiendo al usuario ingresar la cantidad de productos que quiere comprar
            System.out.print("Ingrese la cantidad de productos que quiere comprar: ");
            int cantidadProductos = input.nextInt();
            
            // Pidiendo al usuario ingresar el precio de cada producto
            double[] precios = new double[cantidadProductos];
            for (int i = 0; i < cantidadProductos; i++) {
                System.out.print("Ingrese el precio del producto " + (i+1) + ": ");
                precios[i] = input.nextDouble();
            }
            
            // Calculando el total de cada producto y el total a pagar
            double total = 0;
            for (int i = 0; i < cantidadProductos; i++) {
                double subtotal = precios[i];
                total += subtotal;
                System.out.println("Producto " + (i+1) + ": " + subtotal);
            }
            System.out.println("Total a pagar: " + total);
            
            // Pidiendo al usuario ingresar el monto con el que va a pagar
            System.out.print("Ingrese el monto con el que va a pagar: ");
            double montoPagado = input.nextDouble();
            
            // Verificando si el monto pagado es suficiente o no
            if (montoPagado < total) {
                System.out.println("El monto pagado no es suficiente.");
            } else {
                // Calculando y mostrando el cambio
                double cambio = montoPagado - total;
                System.out.println("Cambio: " + cambio);
            }
        }
    }

}
