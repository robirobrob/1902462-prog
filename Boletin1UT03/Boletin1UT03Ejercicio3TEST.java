import java.util.Scanner;

public class Boletin1UT03Ejercicio3TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa la primera cadena: ");
    String text1 = scanner.nextLine();
    System.out.print("Ingresa la segunda cadena: ");
    String text2 = scanner.nextLine();

    if (text1.equals(text2)) {
      System.out.println("Las cadenas de texto son iguales.");
    } else {
      System.out.println("Las cadenas de texto no son iguales.");
    }

    if (text1.equalsIgnoreCase(text2)) {
      System.out.println("Las cadenas de texto son iguales sin diferenciar entre mayúsculas y minúsculas.");
    } else {
      System.out.println("Las cadenas de texto no son iguales sin diferenciar entre mayúsculas y minúsculas.");
    }
  }
}
