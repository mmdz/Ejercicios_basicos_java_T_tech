package egg.guia.cinco.vectores;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.**
 */
public class Ejercicio_25 {

    int i, j;

    public static void main(String[] args) {
        int numero = 0;
        int[][] matriz = new int[3][3];
        int sumaH, sumaD, sumaV;

        sumaH = 0;
        sumaD = 0;
        sumaV = 0;

        Scanner leer = new Scanner(System.in);

        //cargo la matriz
        System.out.println("Complete el cubo con nros de 1-9.\nFila - Columna");

        for (int i = 0; i < 3; i++) { //cargo la matriz por teclado
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println((i + 1) + ", " + (j + 1));
                    numero = leer.nextInt();
                    matriz[i][j] = numero;
                } while (numero < 1 || numero > 9); //valido el rango
            }
        }//finForCarga

        for (int i = 0; i < 3; i++) { //compara fila-col
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    sumaH += matriz[i][j];
                }
                if (j == i) {
                    sumaD += matriz[i][j];
                }
                if (j == 0) {
                    sumaV += matriz[i][j];
                }
            }
        }//finForComparacion
        
        if(sumaH == sumaD && sumaH == sumaV){
            System.out.println("La matriz es magica y la suma es: "+sumaH);
        }else{
            System.out.println("La matriz no es magica");   
        }

    }//finMain

}//finAlgoritmo


