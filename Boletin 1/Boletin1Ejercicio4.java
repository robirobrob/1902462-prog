
import java.util.Scanner;

public class Boletin1Ejercicio4 {
    public static void main (String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int salario;
        int porcentaje;
        
        System.out.println("Introduzca un salario del 800 al 3000");
        salario = sc.nextInt();
        System.out.println("Introduzca un porcentaje del 10% al 20%");
        porcentaje = sc.nextInt();
        System.out.println("Sueldo base es de " + salario);
        System.out.println("El complemento es de " +porcentaje);
        int sueldo= (salario/100)*porcentaje+salario;
        System.out.println("El sueldo final es " +sueldo);
    }
}
