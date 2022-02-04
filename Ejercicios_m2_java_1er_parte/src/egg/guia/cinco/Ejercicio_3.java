package egg.guia.cinco;
import java.util.Scanner;

/*Ejercicio_3_Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java. */

public class Ejercicio_3 {

    public static void main(String[] args) {
       String frase;
       Scanner leer = new Scanner(System.in);//creo el objeto leer
       
       System.out.println("Ingrese una frase");
       frase = leer.nextLine();
       
        System.out.println("La frase en mayuscula: "+frase.toUpperCase());
        System.out.println("La frase en minuscula: "+frase.toLowerCase());
           
    }
    
}
