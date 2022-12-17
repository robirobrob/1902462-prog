
import java.util.Scanner;

public class Boletin2UT02Ejercicio1TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int combinacion = 1234;

        int oportunidades = 4;

        while (oportunidades > 0) {
            System.out.print("Introduce la combinación: ");
            int combinacionIntroducida = scanner.nextInt();

            if (combinacionIntroducida == combinacion) {
                System.out.println("PUEDES PASAR");
                break;
            } else {
                System.out.println("Lo siento, no puedes entrar");
                oportunidades--;
            }
        }
    }
}
