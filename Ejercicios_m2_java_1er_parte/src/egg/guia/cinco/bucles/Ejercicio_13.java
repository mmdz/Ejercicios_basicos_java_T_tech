package egg.guia.cinco.bucles;
import java.util.Scanner;

/**Escriba un programa en el cual se ingrese un valor límite positivo, y a 
 * continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial. */
public class Ejercicio_13 {
    public static void main(String[] args) {
        int limite;
        int numero;
        int suma = 0;
        
        Scanner leer = new Scanner(System.in);     
        System.out.println("Ingrese limite(entero positivo) ");
        limite  = leer.nextInt();
                
        do{    
            System.out.println("Ingrese un numero");
            numero  = leer.nextInt();
            suma += numero;
            
        }while(limite > suma);
        
        System.out.println("la suma es "+suma);
    }
    
}
