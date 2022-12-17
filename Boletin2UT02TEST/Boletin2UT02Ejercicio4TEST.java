import java.util.Scanner;

public class Boletin2UT02Ejercicio4TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num = scanner.nextInt();

    if (num < 0) {
      System.out.println("El número debe ser positivo.");
      return;
    }

    boolean esPrimo = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        esPrimo = false;
        break;
      }
    }

    if (esPrimo) {
      System.out.println(num + " es un número primo.");
    } else {
      System.out.println(num + " no es un número primo.");
    }
  }
}
