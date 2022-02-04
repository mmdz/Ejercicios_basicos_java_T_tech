package egg.guia.cinco.vectores;

import java.util.Scanner;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz.
 */
public class Ejercicio_23 {

    int i, j;

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
//
//        System.out.println("Matriz normal: ");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(matriz[i][j] + " "); //print solo no salta linea
//            }
//            System.out.println(" ");//printLN si salta linea
//        }
        System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " "); //print solo no salta linea
            }
            System.out.println(" ");//printLN si salta linea
        }

    }

}
