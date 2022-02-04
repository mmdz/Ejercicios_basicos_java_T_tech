package egg.guia.cinco.extras;
import java.util.Scanner;

/**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
public class Ejercicio_2_extras {

    public static void main(String[] args) {
        int A,B,C,D,aux;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese A");
        A = leer.nextInt();
        System.out.println("Ingrese B");
        B = leer.nextInt();
        System.out.println("Ingrese C");
        C = leer.nextInt();
        System.out.println("Ingrese D");
        D = leer.nextInt();       
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("A = "+A+"\nB = "+B+"\nC = "+C+"\nD = "+D);
    }
    
}
