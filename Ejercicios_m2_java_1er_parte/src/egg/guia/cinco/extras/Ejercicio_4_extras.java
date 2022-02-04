package egg.guia.cinco.extras;
import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
y se muestre su equivalente en romano.*/
public class Ejercicio_4_extras {

    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        numero = leer.nextInt();
        
        switch(numero){
            case 1: System.out.println("1 en romano: I");
            break;
            case 2: System.out.println("2 en romano: Ii");
            break;
            case 3: System.out.println("3 en romano: III");
            break;
            case 4: System.out.println("4 en romano: IV");
            break;
            case 5: System.out.println("5 en romano: V");
            break;
            case 6: System.out.println("6 en romano: VI");
            break;
            case 7: System.out.println("7 en romano: VII");
            break;
            case 8: System.out.println("8 en romano: VIII");
            break;
            case 9: System.out.println("9 en romano: IX");
            break;
            case 10: System.out.println("10 en romano: X");
            break;        
            default: System.out.println("Número inválido");
            break;
        }
        
    }
    
}
