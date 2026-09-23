
import javax.swing.JOptionPane;
public class Impresiones {
    
    
    public static void main (String[] args) {
        String nombreEstudiante = IngreseNombre ( "Ingrese el nombre del estudiante: ");
        int cantidadPaginas = IngresePaginas(" Ingrese la cantidad de paginas a imprimir: ");
        String tipoDocumento = IngreseDocumento( "Ingrese el tipo de documento (tarea, proyecto, tesis): ");
        double costoImpresion = CalcularCosto (cantidadPaginas);
        String prioridadImpresion = CalcularPrioridad (cantidadPaginas) ;
        generarMensaje (nombreEstudiante, tipoDocumento, cantidadPaginas, prioridadImpresion, costoImpresion) ; {

        public static String IngreseNombre (String mensaje) {
            String nombre = JOptionPane.showInputDialog(mensaje);
            return nombre;
        }

        public static int IngresePaginas (String paginas) {
            int cantPaginas = Integer.parseInt(JOptionPane.showInputDialog(paginas));
            return cantPaginas;
        }

        public static String IngreseDocumento ( String documento) {
            String docum = JOptionPane.showInputDialog(documento) ;
            String documMinus = docum.toLowerCase();
            return documMinus;
        }

        public static double CalcularCosto (int cantidadPaginas) {
            double costo = cantidadPaginas * 200 ;
            return costo;
        }

        public static String CalcularPrioridad (int cantidaPaginas ) {
            String prioridad = "";
            if ( cantidaPaginas < 20) {
                prioridad = "Priodidad Baja" ;
            }

            if ( cantidaPaginas >= 20 && cantidaPaginas < 50) {
                    prioridad = "Prioridad Media" ;
            }
            if ( cantidaPaginas > 50) {
                prioridad = "Prioridad Alta" ;
            }

            return prioridad; 

            }

        public static void generarMensaje ( String nombreEstudiante, String tipoDocumento, int cantidadPaginas, String prioridadImpresion, double costoImpresion) {
                String mensajeFinal = "Nombre del estudiante: " + nombreEstudiante + " El tipo de Documento es : " + tipoDocumento + "La cantidad de paginas es : " + cantidadPaginas + "La prioridad de impresion es : " + prioridadImpresion + "El costo de impresion es : " + costoImpresion ;

                JOptionPane.showMessageDialog(null, mensajeFinal );
            }

            

        }


