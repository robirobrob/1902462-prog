import java.util.Arrays;
import java.util.Scanner;

public class Boletin2UT03Ejercicio7TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] array1 = new int[10];
    int[] array2 = new int[10];

    for (int i = 0; i < 20; i++) {
      System.out.print("Ingresa un valor: ");
      int valor = scanner.nextInt();
      if (i < 10) {
        array1[i] = valor;
      } else {
        array2[i - 10] = valor;
      }
    }

    if (Arrays.equals(array1, array2)) {
      System.out.println("Los arrays son iguales.");
    } else {
      System.out.println("Los arrays son diferentes.");
    }
  }
}
