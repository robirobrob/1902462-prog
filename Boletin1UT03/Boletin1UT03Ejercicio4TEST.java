import java.util.Scanner;

public class Boletin1UT03Ejercicio4TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String name = scanner.nextLine();
    System.out.print("Ingresa tu primer apellido: ");
    String surname1 = scanner.nextLine();
    System.out.print("Ingresa tu segundo apellido: ");
    String surname2 = scanner.nextLine();

    String code = name.substring(0, 3).toUpperCase() + surname1.substring(0, 3).toUpperCase() + surname2.substring(0, 3).toUpperCase();

    System.out.println("Tu código de usuario es: " + code);
  }
}
