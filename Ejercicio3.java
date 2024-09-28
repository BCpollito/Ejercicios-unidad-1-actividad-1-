import java.util.Scanner;
/**
 *
 * @author BCpollito
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float corte1, corte2, nota3;
        
        System.out.println("EJERCICIO 2 UNIDAD 1\nCalcular nota minima del tercer corte\n");
        System.out.println("Ingrese las notas del primero y segundo corte Respectivamente:");
        System.out.print("1#: ");
        corte1 = teclado.nextFloat();
        System.out.print("2#: ");
        corte2 = teclado.nextFloat();
        
        nota3 = corte1 * 0.2f + corte2 * 0.2f;
        nota3 = (3 - nota3)/0.6f;
        
        System.out.println("\nNecesitas almenos una nota de "+ nota3 +" en el "
                + "Tercer corte para pasar la asignatura");
    }
}
