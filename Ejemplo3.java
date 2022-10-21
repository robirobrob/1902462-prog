
import java.util.Scanner;

public class Ejemplo3 {

    public static void main (String[] args) {
        int numero=0, numero_tabla;
        Scanner sc;

        sc = new Scanner (System.in);
        System.out.println("Introduce el numero del que quieres la tabla.");
        numero_tabla = sc.nextInt();

        if (numero_tabla<=20) {
            System.out.println("Tabla del numero " + numero_tabla);
            while (numero<=10) {
                int producto=numero_tabla*numero;
                System.out.println (numero_tabla + "x" + (numero++) + "=" + producto); /*numero++ es lo mismo que poner numero=numero+1*/
            }
        } else {
            while (numero_tabla>20) {
                System.out.println("Introduzca un numero menor que 20");
                numero_tabla = sc.nextInt();
                System.out.println("Tabla del numero " + numero_tabla);
            }
            while (numero<=10) {
                int producto=numero_tabla*numero;
                System.out.println (numero_tabla + "x" + (numero++) + "=" + producto);
            }
        }
    }
}
