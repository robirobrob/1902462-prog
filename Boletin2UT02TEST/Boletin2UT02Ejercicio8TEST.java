import java.util.Scanner;

public class Boletin2UT02Ejercicio8TEST {
  public static void main(String[] args) {
    // Pedimos por teclado el número de filas
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el número de filas: ");
    int n = scanner.nextInt();

    // Imprimimos la pirámide
    for (int i = 1; i <= n; i++) {
      // Imprimimos los espacios en blanco
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Imprimimos los números en orden ascendente
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      // Imprimimos los números en orden descendente
      for (int j = 2; j <= i; j++) {
        System.out.print(j);
      }
      // Saltamos a la siguiente línea
      System.out.println();
    }
  }
}
