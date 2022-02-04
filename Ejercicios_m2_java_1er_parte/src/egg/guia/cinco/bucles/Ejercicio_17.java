package egg.guia.cinco.bucles;
import java.util.Scanner;

/**
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        int dim;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba la dimensión del cuadrado");
        dim = leer.nextInt();
        for (int i = 1; i <= dim; i++) {
            
            for (int j = 1; j <= dim; j++) {
                
                if ((i == dim || i == 1) || (j == 1 || j == dim)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
//
//Scanner leer = new Scanner(System.in);
//        int num,i,j;
//        System.out.println("Escriba un numero: ");
//        num = leer.nextInt();
//        
//        i = 0;
//        j = 0;
//        
//        while(i<num){
//            System.out.print("*");
//            i = i + 1;
//        }
//        
//        System.out.println(" ");
//        
//        i = 0;
//        
//        while(i<num) {
//            System.out.print("*");
//            while(j<num - 2){
//                System.out.print(" ");
//                j = j + 1;
//            }
//            System.out.println("*");
//            i = i + 2;
//            j = 0;
//        }
//        
//        i = 0;
//        
//        while(i<num){
//            System.out.print("*");
//            i = i + 1;
//        }
//        
//        System.out.println(" ");
    
    
