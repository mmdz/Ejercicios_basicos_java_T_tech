package egg.guia.cinco;
import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
public class Ejercicio_8 {

    public static void main(String[] args) {

        String frase;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine(); 
        
        if (frase.toLowerCase().equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");      
        }
    }
    
}
