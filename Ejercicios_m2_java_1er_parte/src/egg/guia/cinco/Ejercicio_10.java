package egg.guia.cinco;
import java.util.Scanner;

/**Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/
public class Ejercicio_10 {

    public static void main(String[] args) {
        String frase,letra;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine(); 
        letra = frase.substring(0,1);
        
        if (letra.toUpperCase().equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");      
        }
    }
    
}
