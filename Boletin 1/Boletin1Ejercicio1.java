
import java.util.Scanner;
import java.io.*; 

public class Boletin1Ejercicio1 {

    public static void main (String[] args) {
        String cadena;
        int numero_a;
        int numero_b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tres numeros");
        numero_a = sc.nextInt();
        numero_b = sc.nextInt();

        if (numero_a>numero_b) {
                System.out.println("El mayor es " + numero_a);
			} else {
				System.out.println("EL mayor es " + numero_b);
                }
            }
        }                               	

