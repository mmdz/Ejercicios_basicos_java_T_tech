package egg.guia.cinco.vectores;
import java.util.Scanner;

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.*/
public class Ejercicio_20 {

   
    public static void main(String[] args) {
       int[] vector; 
       vector = new int[101]; 
       
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }

    }
    
}
