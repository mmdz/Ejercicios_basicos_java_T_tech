package egg.guia.cinco.extras;

import java.util.Scanner;

/**Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si
 * se trata de una vocal. Caso contrario mostrar un mensaje. 
 * Nota: investigar la función equals() de la clase String.*/
public class Ejercicio_3_extras {

    public static void main(String[] args) {
        String letra ="";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        letra = letra.toUpperCase();
        
        if(letra.equals("A")||letra.equals("E")||
            letra.equals("O")||letra.equals("U")||
            letra.equals("I")){
            System.out.println("Vocal");
        } else {
            System.out.println("No es vocal");
        }
    }
    
}
