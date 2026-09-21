import java.util.Scanner;

public class CalcularProduccion {
    public static void main(String[] args) {
        // Los mensajes que pasamos son Strings, no números
        int numeroCamisas = ingresarEntero("Ingresar cantidad de camisas producidas: ");
        double cantidadHoras = ingresarRealD("Ingresar cantidad de horas trabajadas: ");
        double costoCamisa = ingresarRealD("Ingresar costo de produccion por camisa: ");
        
        double camisasHora = calcularProduccionHora(numeroCamisas, cantidadHoras);
        double costoTotal = calcularCosto(costoCamisa, numeroCamisas);
        
        // Pasamos todas las variables necesarias al método
        generarMensaje(numeroCamisas, cantidadHoras, costoCamisa, camisasHora, costoTotal);
    }

    // Cambiado 'int mensaje' por 'String mensaje'
    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }

    // Cambiado 'double mensaje' por 'String mensaje'
    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static double calcularProduccionHora(int numeroCamisas, double cantidadHoras) {
        return (double) numeroCamisas / cantidadHoras;
    }

    public static double calcularCosto(double costoCamisa, int numeroCamisas) {
        return costoCamisa * numeroCamisas;
    }

    // El método ahora recibe todos los datos para poder imprimirlos
    public static void generarMensaje(int num, double horas, double costo, double prodHora, double total) {
        System.out.println("\n--- Resumen de Producción ---");
        System.out.println("La cantidad de camisas producidas fue de: " + num);
        System.out.println("La cantidad de horas trabajadas es de: " + horas);
        System.out.println("El costo de producción por camisa es: $" + costo);
        System.out.println("La producción de camisas por hora es: " + prodHora);
        System.out.println("El costo total de producción es: $" + total);
    }
}