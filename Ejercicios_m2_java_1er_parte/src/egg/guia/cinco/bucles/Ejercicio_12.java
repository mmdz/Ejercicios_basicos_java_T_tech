package egg.guia.cinco.bucles;

import java.util.Scanner;

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.**/
public class Ejercicio_12 {

    public static void main(String[] args) {
        int nota,cont;
        cont = 0;
        Scanner leer = new Scanner(System.in);
        
        do{        
            System.out.println("Ingrese una nota de 0 a 10");
            nota = leer.nextInt(); 
            if (nota >= 0 && nota <= 10 ){
                cont++;
            }
        }while (cont == 0);
    }
    
}
