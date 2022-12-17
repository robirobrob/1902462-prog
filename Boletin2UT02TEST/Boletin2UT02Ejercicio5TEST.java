import java.util.Scanner;

public class Boletin2UT02Ejercicio5TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num = scanner.nextInt();

    if (num < 0) {
      System.out.println("El número debe ser positivo.");
      return;
    }

    int suma = 0;
    for (int i = num + 1; i <= num + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + num + " es: " + suma);
  }
}

