package egg.guia.cinco.vectores;
import java.util.Scanner;

/**Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido***/

public class Ejercicio_21 {
    int i; //variable global
    int j;
    public static void main(String[] args) {
    
        int tamanio; //varaible local
        int numero; 
        int contador = 0 ;
        int posicion;
        
        Scanner leer = new Scanner(System.in);
  
        tamanio = (int)(Math.random()*10+1); //con 10+1 me da el 10 inclusive
        
        int[] vector = new int[tamanio]; //le doy un tamanio N
        
        int[] vectorEncontrados = new int[tamanio];

            for (int i = 0; i < tamanio; i++) {
               vector[i] =(int)(Math.random()*10+1); //cargo vector y casteo a enteros   
            }

            System.out.println("Ingrese el número a buscar: ");
            numero = leer.nextInt();

            for (int i = 0; i < tamanio; i++) {
                 posicion = i;
                  if (numero == vector[i]) {   
                   contador++; 
                   for (int j = 1; j < tamanio; j++) {
                
                    vectorEncontrados[contador] = posicion ; //guardo los que va encontrando                        
                            // System.out.println("posicion de carga "+posicion+",  "+j);                   
                    }                                     
                }
                    //System.out.println("contador "+contador);
            }
            
            if (contador >0) {               
                System.out.println("El numero "+numero+" esta en la posicion: ");
                
                for (int j = 1; j <= contador; j++) {
                    System.out.println(vectorEncontrados[j]+","); //inicializo el vector
                }                
            }else{
                                
                System.out.println("El numero no "+numero+" se encontró");
            }
                

    }
    
}
