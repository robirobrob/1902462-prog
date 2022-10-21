
/*Roberto Miguel
 * 14/10/2022
 * Hello World.
 */
import java.util.Scanner;

public class ejemplo01 {
	
	public static void main (String[] args) {
		
		String cadena;
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		cadena = sc.nextLine();
		System.out.println("Hola, " + cadena);
		
		// entrada de un numero
        System.out.println("Escribe tu edad");
		numero = sc.nextInt();
		System.out.println("Tu edad es " + numero);
        
		
	}
}
