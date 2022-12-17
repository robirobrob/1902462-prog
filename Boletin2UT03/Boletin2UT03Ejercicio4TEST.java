import java.util.Scanner;

public class Boletin2UT03Ejercicio4TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] valores = new int[100];
    for (int i = 0; i < 100; i++) {
      valores[i] = 1 + (int)(Math.random() * 10);
    }

    System.out.print("Ingresa el valor de N: ");
    int n = scanner.nextInt();

    System.out.print("El valor de N aparece en las posiciones: ");
    for (int i = 0; i < 100; i++) {
      if (valores[i] == n) {
        System.out.print(i + " ");
      }
    }
  }
}
