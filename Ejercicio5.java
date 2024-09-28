import java.util.Scanner;

/**
 *
 * @author BCpollito
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float lado1, lado2, lado3;
        
        System.out.println("EJERCICIO 5 UNIDAD 1\nCalcular Perimetro de un triangulo\n");
        System.out.println("Inserte los lados del triangulo:");
        System.out.print("Lado 1: ");
        lado1 = teclado.nextFloat();
        System.out.print("Lado 2: ");
        lado2 = teclado.nextFloat();
        System.out.print("Lado 3: ");
        lado3 = teclado.nextFloat();
        
        float perimetro = lado1 + lado2 + lado3;
        
        System.out.println("\nEl perimetro del triangulo es: "+ perimetro);
    }
}
