package egg.guia.cinco.vectores;

import java.util.Scanner;

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -A(traspuesta). La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
En este caso la matriz es anti simétrica.
 */
public class Ejercicio_24 {

    int i, j;

    public static void main(String[] args) {
        int iguales = 0;
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        int[][] matrizA = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //para probar si funciona la cargo en ceros
                //matriz[i][j] = 0;
               matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        //matriz original
        System.out.println("Matriz normal: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " "); //print solo no salta linea
            }
            System.out.println(" ");//printLN si salta linea
        }

        //traspuesta
        System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[i][j] = matriz[j][i];

                //System.out.print(matriz[j][i] + " "); //print solo no salta linea
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println(" ");//printLN si salta linea
        }
        //traspuesta con signo cambiado    
        System.out.println("Matriz traspuesta negada: ");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = matrizT[i][j] * (-1);
                System.out.print(matrizA[i][j] + " "); //print solo no salta linea
            }
            System.out.println(" ");//printLN si salta linea
        }

        //comparo original y trasp(-1)
        System.out.println("comparo: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(matrizA[i][j] == matriz[i][j]){
                    iguales++; 
                }                                
                //System.out.print(matrizA[i][j] + " "); //print solo no salta linea
            }
            //System.out.println(" ");//printLN si salta linea
        }
        
        if(iguales == 16){
            System.out.println("Matriz es antisimetrica");
        }else{
            System.out.println("No es antisimetrica");
        }
        
    }//fin main

}//fin algoritmo
