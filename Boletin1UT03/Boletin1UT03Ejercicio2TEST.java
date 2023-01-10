import java.util.Scanner;

public class Boletin1UT03Ejercicio2TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa una cadena de texto: ");
    String text = scanner.nextLine();

    String[] words = text.split(" ");

    for (String word : words) {
      System.out.println(word);
    }
  }
}
