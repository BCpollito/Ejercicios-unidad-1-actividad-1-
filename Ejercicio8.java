import java.util.Scanner;

/**
 *
 * @author BCpollito
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float millasmarinas, metros;
        
        System.out.println("EJERCICIO 8 UNIDAD 1\nConversor de millas marinas a metros\n");
        System.out.println("Ingrese el la distancia en millas marinas:");
        millasmarinas = teclado.nextFloat();
        
        metros = millasmarinas * 1852;
        
        System.out.println("\n"+ millasmarinas +" millas marinas representadas "
                + "en metros son: "+metros+" metros");
    }
}
