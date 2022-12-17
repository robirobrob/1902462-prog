import java.util.Scanner;

public class Boletin2UT03Ejercicio2TEST{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el valor de N: ");
    int n = scanner.nextInt();
    System.out.print("Ingresa el valor de M: ");
    int m = scanner.nextInt();

    int[] numeros = new int[n];

    int numMultiplos = 0;
    for (int i = 0; i < n; i++) {
      System.out.print("Ingresa un número:");
      int numero = scanner.nextInt();
      if (numero % m == 0) {
        numeros[numMultiplos] = numero;
        numMultiplos++;
      }
    }

    System.out.println("Los valores introducidos son:");
    for (int i = 0; i < numMultiplos; i++) {
      System.out.print(numeros[i] + " ");
    }
  }
}
