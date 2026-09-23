30mport java.util.Scanner;

public class CalcularProduccion {
    public static void main (String [] args) {
        int NumeroCamisas = IngresarEntero( "Ingresar cantidad de camisas producidas: ");
        double CantidadHoras = IngresarRealD( "Ingresar cantidad de horas trabajadas: ");
        double CostoCamisa = IngresarRealD( "Ingresar coso de produccion por camisa = ");
        double CamisasHora = CalcularProduccionHora(NumeroCamisas , CantidadHoras);
        double CostoTotal = CalcularCosto ( CostoCamisa , NumeroCamisas );
        generarMensaje (NumeroCamisas, CantidadHoras, CostoCamisa,CamisasHora,CostoTotal);
    }

    public static int IngresarEntero (String Mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print( mensaje);
        int num1 = sc.nextInt();
        return num1;
    
    }

    public static double IngresarRealD (String Mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print( mensaje);
        double num2 = sc.nextDouble();
        return num2;
    }

    public static double CalcularProduccionHora( int NumeroCamisas, double CantidadHoras) {
        double ProduccionHora = NumeroCamisas/CantidadHoras;
        return ProduccionHora;
    }

    public static double CalcularCosto( double CostoCamisa, int NumeroCamisas) {
        double CostoProduccion = CostoCamisa * NumeroCamisas;
        return CostoProduccion;
    }

    public static void generarMensaje (String mensaje) {

        String mostrarMensaje = System.out.print( " La cantidad de camisas producidas fue de: " + NumeroCamisas + 
            "La cantidad de horas trabajadas es de: " + CantidadHoras + 
            "El costo de producción por camisa es: " + CostoCamisa +
            "La produccion de camisas por hora es : " + CamisasHora + 
            "El costo total de produccion es: " + CostoTotal);

    }


}

    
