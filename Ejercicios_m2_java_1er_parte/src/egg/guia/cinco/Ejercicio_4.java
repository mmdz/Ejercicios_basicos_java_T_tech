package egg.guia.cinco;

import java.util.Scanner;
/*Ejer_4 _Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */

public class Ejercicio_4 {

    public static void main(String[] args) {
        //atributos
        float grados_c;
        float grados_f;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese temperatura en grados Centigrados: ");
        grados_c = leer.nextFloat();
        
        grados_f = 32+(9*grados_c/5);
        
        System.out.println("La temperatura "+grados_c+"°C, en grados Fahrenheit: "+grados_f+"°F");
    }
    
}
