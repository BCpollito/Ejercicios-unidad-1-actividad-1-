import java.util.Scanner;

/**
 *
 * @author BCpollito
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x, y, z, A;
        
        System.out.println("EJERCICIO 19 UNIDAD 1\nCalcular A segun x y z");
        System.out.println("Ingrese los valores de las variables:");
        System.out.print("x: ");
        x = teclado.nextFloat();
        System.out.print("y: ");
        y = teclado.nextFloat();
        System.out.print("z: ");
        z = teclado.nextFloat();
        
        A = 2 * x * 2 * y * 3 * z;
        
        System.out.println("\nEl Resultado y valor de 'A' es: "+A);
    }
}
