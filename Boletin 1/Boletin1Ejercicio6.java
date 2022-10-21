
import java.util.Scanner;

public class Boletin1Ejercicio6{
	
	public static void main (String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int a;
	    int b;
		
		System.out.println("Introduce 2 variables");
		a = sc.nextInt();
		b = sc.nextInt();
		int suma= a+b;
		System.out.println("La suma es "+ suma);
		int producto= a*b;
		System.out.println("El producto es "+producto);
		int cociente= a/b;
		System.out.println("El cociente es "+cociente);
		int resto= a%b;
		System.out.println("El resto es "+resto);
	}
}

