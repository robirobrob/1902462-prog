import java.util.Scanner;
import java.io.*; 

public class Boletin2Ejercicio4 {

    public static void main (String[] args) {
        String cadena;
        int numero_a;
        int numero_b;
        int numero_c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tres numeros");
        numero_a = sc.nextInt();
        numero_b = sc.nextInt();
        numero_c = sc.nextInt();

        if (numero_a>numero_b) {
            if (numero_a>numero_c) {
                System.out.println("El mayor es " + numero_a);
        } else {
            if (numero_b>numero_c) {
                    System.out.println("El mayor es " + numero_b);
            } else {
                    System.out.println("El mayor es " + numero_c);
                }
            }
        }
    }
} 
