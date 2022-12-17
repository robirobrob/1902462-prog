
import java.util.ArrayList;
import java.util.Scanner;

public class Boletin2UT02Ejercicio2TEST {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();
    while (true) {
      System.out.print("Introduce un número positivo (un número negativo para terminar): ");
      int num = scanner.nextInt();
      if (num < 0) {
        break;
      }
      nums.add(num);
    }
    double media = 0;
    for (int n : nums) {
      media += n;
    }
    media /= nums.size();
    System.out.println("La media de los números introducidos es: " + media);
  }
}
