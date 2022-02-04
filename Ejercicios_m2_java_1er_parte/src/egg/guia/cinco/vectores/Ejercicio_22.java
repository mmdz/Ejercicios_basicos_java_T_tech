package egg.guia.cinco.vectores;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio_22 {

    int i;

    public static void main(String[] args) {
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        int n, numero;

        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantos números desea ingresar un número?");
        n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            
            vector[i] = numero;
        }

        for (int i = 0; i < n; i++) {

            if ((vector[i] >= 10000) && (99999 >= vector[i])) {
                cinco++;
            } else {
                if ((vector[i] >= 1000) && (9999 >= vector[i])) {
                    cuatro++;
                } else {
                    if ((vector[i] >= 100) && (999 >= vector[i])) {
                        tres++;
                    } else {
                        if ((vector[i] >= 10) && (99 >= vector[i])) {
                            dos++;
                        } else {
                            uno++;
                        }
                    }
                }
            }

        }//fin for

        System.out.println(
                "Números con cantidad de digitos: ");
        System.out.println(
                "1 Digito: " + uno);
        System.out.println(
                "2 Digito: " + dos);
        System.out.println(
                "3 Digito: " + tres);
        System.out.println(
                "4 Digito: " + cuatro);
        System.out.println(
                "5 Digito: " + cinco);
    }//fin main
}//fin algoritmo
