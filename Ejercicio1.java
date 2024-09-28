
import java.util.Scanner;

/**
 *
 * @author BCpollito
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float vhora, thora, neto, total, Rfuente;

        Scanner teclado = new Scanner(System.in);
        System.out.println("EJERCICIO 1 UNIDAD 1\nCalcular salario total, salario neto y rentencion de la fuente");
        System.out.println("Cuantas hora trabaja diariamente:");
        thora = teclado.nextFloat();
        System.out.println("Cual es el valor del pago por hora:");
        vhora = teclado.nextFloat();
        System.out.println("\n");
        
        total = vhora * thora;//valor del salario total
        Rfuente = total * 0.05f; //valor de la retencion de la fuente
        neto = total - Rfuente;
        
        System.out.println("\n\nLOS RESULTADOS SON \n");
        System.out.println("Salario total: " + total);
        System.out.println("Retencion de la fuente: " + Rfuente);
        System.out.println("Salario neto: " + neto);
        
    }
    
}
