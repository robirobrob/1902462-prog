import java.util.Scanner;

public class Boletin2UT03Ejercicio6TEST {
  public static void main(String[] args) {
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(0);
    }

    Scanner scanner = new Scanner(System.in);
    boolean run = true;
    while (run) {
      System.out.println("MENU PRINCIPAL");
      System.out.println("a. Mostrar valores");
      System.out.println("b. Introducir valor");
      System.out.println("c. Salir");
      System.out.print("Elige una opcion y presiona intro: ");
      String option = scanner.nextLine();

      switch (option) {
        case "a":
          for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
          }
          System.out.println();
          break;
        case "b":
          System.out.print("Valor: ");
          int value = scanner.nextInt();
          System.out.print("Posición: ");
          int position = scanner.nextInt();

          array[position] = value;
          break;
        case "c":
          run = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, elige una opción válida.");
          break;
      }
    }
  }
}
