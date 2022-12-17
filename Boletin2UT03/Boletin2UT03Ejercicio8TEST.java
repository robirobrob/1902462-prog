import java.util.Arrays;
import java.util.Scanner;

public class Boletin2UT03Ejercicio8TEST {
  public static void main(String[] args) {
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * 100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un valor N: ");
    int n = scanner.nextInt();

    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        count++;
      }
    }

    if (count > 0) {
      System.out.println("N sí existe en el array y aparece " + count + " veces.");
    } else {
      System.out.println("N no existe en el array.");
    }
  }
}
