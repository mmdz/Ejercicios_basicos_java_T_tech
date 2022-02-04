package egg.guia.cinco.bucles;
import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
public class Ejercicio_15 {
    int i;
    public static void main(String[] args) {
        int numero, suma = 0;
        
        Scanner leer = new Scanner(System.in);       
        
        for(int i = 0; i <= 20; i++) {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();  
            if(numero > 0){
                suma += numero;
            }
            if(numero == 0){
                
                System.out.println("Se capturo el número 0"); 
                break; //corta el proceso cuando se cumple la condicion
            } 
        }
        System.out.println("La suma de los positivos ingresados es: "+suma);  
    }
    
}
