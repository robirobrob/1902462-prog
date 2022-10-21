
import java.util.Scanner;

public class Boletin1Ejercicio2 {

    public static void main (String[] args) {
        int b=2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();
        int resto = numero%b; //resto de la division del numero introducido entre 2
        if (resto>0) { 
            System.out.println("El numero es impar");
        } else {
            System.out.println("El numero es par");
        }
    }
}

