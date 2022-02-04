package egg.guia.cinco;

import java.util.Scanner;
/** 5. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */

public class Ejercicio_5 {

    public static void main(String[] args) {
        float numero, raiz, doble, triple;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero = leer.nextFloat();
        
        doble = numero*2;
        triple = numero*3;
        raiz = (float) Math.sqrt(numero);
        
        System.out.println("Para el numero: "+numero);
        System.out.println("el doble: "+doble+", el triple "+triple+", la raiz cuadrada "+raiz);
        
    }
    
}



