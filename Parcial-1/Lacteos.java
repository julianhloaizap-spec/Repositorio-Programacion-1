import javax.swing.JOptionPane;

public class Lacteos {
    public static void main (String [] args) {
        int muestras = ingresarEntero("Ingrese la cantidad de muestras a analizar: ");
        double cantidadGrasa= ingresarRealD("Ingrese cantidad de grasa: ");
        double [] grasa = ingresarNReales ("Ingrese cantidad de grasa: ", muestras);
        int cantidadOptima = contarGrasaOptima (grasa);
        double promedioGrasas = calcularPromedio (muestras, grasa);
        double porcentajeOptimo = calcularPorcentaje (cantidadOptima, muestras);
        generarMensaje(cantidadOptima, promedioGrasas, porcentajeOptimo);
    }

    public static int ingresarEntero (String mensaje) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return valor;
    }
     public static double ingresarRealD(String mensaje) {
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return valor1;
    }
    public static double[] ingresarNReales (String mensaje, int muestras) {
        double[] grasa = new double [muestras];
        
        for (int i=0; i<muestras; i++) {
            grasa[i]= ingresarRealD(mensaje);
            System.out.println("La i es: "+i+"\n"+"La grasa es: "+"\n"+grasa[i]);
        }
        return grasa;
    }
    public static int contarGrasaOptima(double [] grasa) {
        int contador =0;
        for (int i=0; i<grasa.length; i++) {
            if (grasa[i]>=30 && grasa[i]<=35) {
                contador++;
            }
        }
            return contador;

    }
    public static double calcularPromedio (int muestras, double [] grasa) {
        double suma = 0.0;
        double prom;
        for (int i=0; i<grasa.length; i++) {
            suma+=grasa[i];
        }
        prom = suma/muestras;
        return prom;
    }
    public static double calcularPorcentaje(int cantidadOptima, int muestras) {
        double porcentaje = cantidadOptima/muestras*100;
        return porcentaje;
    }
    public static void generarMensaje (int cantidadOptima, double promedioGrasas, double porcentajeOptimo) {
        String mensaje = "La cantidad de muestras con contenido de grasa apto es: "+cantidadOptima+ "\n"+"el promedio de grasa de las muestras es: "+ promedioGrasas+"\n"+"El porcentaje de muestras aptas para distribucion es: "+porcentajeOptimo;
        JOptionPane.showMessageDialog(null, mensaje);
    }

}