package egg.guia.cinco;

import java.util.Scanner;
/**Crear un programa que dado un numero determine si es par o impar.*/
public class Ejercicio_7 {

    public static void main(String[] args) {
        int numero;
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero "+numero+" es PAR");
        } else {
           System.out.println("El numero "+numero+" es IMPAR");
        }
    }
    
}
