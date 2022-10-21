
import java.util.Scanner;

public class Boletin1Ejercicio5 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base;
		int altura;
		
		System.out.println("Introduce un valor para la base");
		base = sc.nextInt();
		System.out.println("Introduce un valor para la altura");
		altura = sc.nextInt();
		
		int triangulo= (base*altura)/2;
		System.out.println("El area de un triangulo es " + triangulo);
	}
}

