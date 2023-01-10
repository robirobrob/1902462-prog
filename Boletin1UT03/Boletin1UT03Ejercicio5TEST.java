import java.util.Scanner;

public class Boletin1UT03Ejercicio5TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce una frase: ");
    String frase = scanner.nextLine();
    int numA = 0;
    int numE = 0;
    int numI = 0;
    int numO = 0;
    int numU = 0;
    for (int i = 0; i < frase.length(); i++) {
      char c = frase.charAt(i);
      c = Character.toLowerCase(c);
      if (c == 'a') {
        numA++;
      } else if (c == 'e') {
        numE++;
      } else if (c == 'i') {
        numI++;
      } else if (c == 'o') {
        numO++;
      } else if (c == 'u') {
        numU++;
      }
    }
    System.out.println("Nº de A's: " + numA);
    System.out.println("Nº de E's: " + numE);
    System.out.println("Nº de I's: " + numI);
    System.out.println("Nº de O's: " + numO);
    System.out.println("Nº de U's: " + numU);
  }
}
