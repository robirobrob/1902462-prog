import java.util.Scanner;

public class Boletin1UT03Ejercicio7TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce una cadena: ");
    String cadena = scanner.nextLine();
    String resultado = "";
    for (int i = 0; i < cadena.length(); i++) {
      char c = cadena.charAt(i);
      if (c == 'a' && (i == 0 || cadena.charAt(i - 1) != ' ')) {
        c = 'A';
      }
      resultado += c;
    }
    System.out.println("Reemplazando A minúsculas por A mayúsculas, excepto si van precedidas de un espacio: " + resultado);
    resultado = "";
    for (int i = 0; i < cadena.length(); i++) {
      char c = cadena.charAt(i);
      if (i == 0 || cadena.charAt(i - 1) == ' ') {
        resultado += c;
      }
    }
    System.out.println("Iniciales: " + resultado);
    resultado = "";
    for (int i = 0; i < cadena.length(); i++) {
      char c = cadena.charAt(i);
      if (i % 2 == 0) {
        c = Character.toLowerCase(c);
      } else {
        c = Character.toUpperCase(c);
      }
      resultado += c;
    }
    System.out.println("Letras impares en mayúsculas y letras pares en minúsculas: " + resultado);
  }
}
