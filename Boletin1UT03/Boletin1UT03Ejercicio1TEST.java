
import java.util.Scanner;

public class Boletin1UT3Ejercicio1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Introduce valor " + (i+i) + "; ");
			numeros[i] = sc.nextInt();
	}
		System.out.println("Valores:");
		for (int i=0; i<10; i++) {
			System.out.println("Valor " + (i+1) + "; " + numeros[i]);
}
}
}		
