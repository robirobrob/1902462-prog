import java.util.Scanner;

public class Boletin2UT03Ejercicio1TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[15];

    for (int i = 0; i < 15; i++) {
      System.out.print("Ingresa un número: ");
      numeros[i] = scanner.nextInt();
    }

    int ultimo = numeros[14];
    for (int i = 14; i > 0; i--) {
      numeros[i] = numeros[i - 1];
    }
    numeros[0] = ultimo;

    System.out.println("El Array es:");
    for (int numero : numeros) {
      System.out.println(numero);
    }
  }
}
