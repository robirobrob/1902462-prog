import java.util.Scanner;

public class Boletin2UT02Ejercicio3TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce la base: ");
    double base = scanner.nextDouble();
    System.out.print("Introduce el exponente: ");
    int exponente = scanner.nextInt();

    if (exponente < 0) {
      System.out.println("El exponente debe ser positivo.");
      return;
    }

    double potencia = 1;
    for (int i = 1; i <= exponente; i++) {
      potencia *= base;
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
