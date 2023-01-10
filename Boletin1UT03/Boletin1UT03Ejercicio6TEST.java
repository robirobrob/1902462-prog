import java.util.Scanner;

public class Boletin1UT03Ejercicio6TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce una frase: ");
    String frase = scanner.nextLine();
    frase = frase.replaceAll(" ", "");
    frase = frase.toLowerCase();
    boolean esPalindromo = true;
    for (int i = 0; i < frase.length() / 2; i++) {
      char c1 = frase.charAt(i);
      char c2 = frase.charAt(frase.length() - i - 1);
      if (c1 != c2) {
        esPalindromo = false;
        break;
      }
    }
    if (esPalindromo) {
      System.out.println("La frase es un palíndromo");
    } else {
      System.out.println("La frase no es un palíndromo");
    }
  }
}
