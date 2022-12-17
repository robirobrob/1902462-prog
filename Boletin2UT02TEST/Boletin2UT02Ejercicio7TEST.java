
import java.util.Scanner;

public class Boletin2UT02Ejercicio7TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    int sumaImpares = 0;
    int contadorImpares = 0;
    int mayorPar = Integer.MIN_VALUE;
    while (true) {
      System.out.print("Introduce un número (un número negativo para terminar): ");
      int num = scanner.nextInt();
      if (num < 0) {
        break;
      }
      contador++;
      if (num % 2 == 1) {
        sumaImpares += num;
        contadorImpares++;
      } else {
        mayorPar = Math.max(mayorPar, num);
      }
    }

    double mediaImpares = 0;
    if (contadorImpares > 0) {
      mediaImpares = sumaImpares / (double) contadorImpares;
    }

    System.out.println("Se han introducido " + contador + " números.");
    System.out.println("La media de los impares es: " + mediaImpares);
    System.out.println("El mayor de los pares es: " + mayorPar);
  }
}
