
import java.util.Scanner;

/**
 *
 * @author BCpollito
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float lado1, lado2;
        
        System.out.println("EJERCICIO 17 UNIDAD 1\nCalcular Perimetro y area "
                + "de un Rectangulo\n");
        System.out.println("Inserte los lados del Rectangulo:");
        System.out.print("Lado 1: ");
        lado1 = teclado.nextFloat();
        System.out.print("Lado 2: ");
        lado2 = teclado.nextFloat();
        float area = lado1 * lado2;
        float perimetro = (2 * lado1) + (2 * lado2);
        
        System.out.println("\nEl Area del rectangulo es: "+ area);
        System.out.println("El Perimetro del rectangulo es: "+ perimetro);
    }
}
