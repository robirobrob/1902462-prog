import java.util.Scanner;

public class Boletin2UT02Ejercicio6TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    int num1 = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
    int num2 = scanner.nextInt();

    if (num1 < 0 || num2 < 0 || num1 == num2) {
      System.out.println("Los números deben ser positivos y distintos.");
      return;
    }

    int menor = Math.min(num1, num2);
    int mayor = Math.max(num1, num2);

    for (int i = menor; i <= mayor; i++) {
      System.out.println(i);
    }
  }
}
