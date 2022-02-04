package egg.guia.cinco.bucles;

import java.util.Scanner;

/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 * el número ingresado seguido de tantos asteriscos como indique su valor. Por
 * ejemplo: 5 ***** 3 *** 11 *********** 2 **
 */
public class Ejercicio_18 {

    int i, j;

    public static void main(String[] args) {
        int numero, contador = 0, cont = 0 ;
        int[] vector = new int[4];
        int estrellas;

        Scanner leer = new Scanner(System.in);//.useDelimiter("\n");

        do {
            System.out.println("Ingrese un numero de 1 a 20: ");
            numero = leer.nextInt();

            if ((numero > 1) && (numero < 20)) {
                vector[contador] = numero;
                contador++;
            }

        } while ((numero > 1) && (numero < 20) && (contador < 4));
        
    
        while(cont < 5 ){ 
            System.out.print(vector[cont]+" ");
                estrellas = vector[cont];
            
            for (int j = 0; j < estrellas; j++) {
                System.out.print("*");
                //System.out.println("vecotr "+vector[j]);
            }
            System.out.println(" ");
             cont++;
        }
         
    }
}