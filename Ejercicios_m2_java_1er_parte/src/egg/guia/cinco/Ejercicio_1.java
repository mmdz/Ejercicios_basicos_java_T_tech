package egg.guia.cinco; //package que cree yo
import java.util.Scanner;


/*Ej_1_ Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. El programa deberá después mostrar el 
resultado de la suma*/
public class Ejercicio_1{

    public static void main(String[] args) {
        int suma;
        int num_A;
        int num_B;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero A");
        num_A = leer.nextInt();
        System.out.println("Ingrese numero B");
        num_B = leer.nextInt();
        
        suma = num_A+num_B;
        
        System.out.println("La suma de "+num_A+" + "+num_B+" = "+suma);
        
        
        
    }
    
}
