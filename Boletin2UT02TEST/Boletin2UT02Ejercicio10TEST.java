import java.util.Scanner;

public class Boletin2UT02Ejercicio10TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long num = scanner.nextLong();

    if (num < 0) {
      System.out.println("El número debe ser positivo.");
      return;
    }

    String digitosPares = "";
    long sumaPares = 0;
    while (num > 0) {
      long digito = num % 10;
      if (digito % 2 == 0) {
        digitosPares = digito + " " + digitosPares;
        sumaPares += digito;
      }
      num /= 10;
    }

    System.out.println("Dígitos pares: " + digitosPares.trim());
    System.out.println("Suma de los dígitos pares: " + sumaPares);
  }
}
