/*
 Ej_6.Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package egg.guia.cinco;
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int numeroA, numeroB;
        
        Scanner leer = new Scanner(System.in);
           
        System.out.println("Ingrese un numero");
        numeroA = leer.nextInt();
        System.out.println("Ingrese otro numero");
        numeroB = leer.nextInt();
        
        if (numeroA > numeroB) {
           System.out.println("El mayor es "+numeroA); 
        }
        else{
             if (numeroA < numeroB){
                System.out.println("El mayor es "+numeroB);  
             }else{
                System.out.println("Son iguales"); 
             }
        }
        
    }
    
}
