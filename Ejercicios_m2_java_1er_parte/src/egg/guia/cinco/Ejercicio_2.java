package egg.guia.cinco;//paquete que arme yo
import java.util.Scanner; //importo la libreria para usar leer 

/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
 por pantalla.
 * @author win 10
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        //atributos
         String nombre;
        //constructor
        //metodos
        //getter y setter
        Scanner leer = new Scanner(System.in);// 
        
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine(); //leer una cadena
        System.out.println("Bienvennidx "+nombre);
    }
}
