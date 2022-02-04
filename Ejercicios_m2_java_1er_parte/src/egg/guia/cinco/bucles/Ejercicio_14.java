package egg.guia.cinco.bucles;
import java.util.Scanner;

/**Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
public class Ejercicio_14 {

    public static void main(String[] args) {
        Boolean fin = false;
        int numeroA, numeroB;
        int opcion;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;
        String salir = " ";
        
    Scanner leer = new Scanner(System.in); //creo el objeto
     
    System.out.println("Ingrese un número");
    numeroA = leer.nextInt();
    
    System.out.println("Ingrese otro número");
    numeroB = leer.nextInt(); 
    
    while(numeroB == 0){
        System.out.println("Ingrese otro número distinto de cero");
        numeroB = leer.nextInt();    
    }
     

    
    while(fin==false){
    
    System.out.println("MENU\n" + "1. Sumar\n" + "2. Restar\n"+"3. Multiplicar\n" + "4. Dividir\n"+"5. Salir");    
    opcion =  leer.nextInt(); 
    
    switch(opcion){
            case 1: suma = numeroA + numeroB;
                System.out.println("El resultado de "+numeroA+" + "+numeroB+
                        " es: "+suma);
            break;
            case 2: resta = numeroA - numeroB;
                System.out.println("El resultado de "+numeroA+" - "+numeroB+
                        " es: "+resta);            
            break;    
            case 3: multiplicacion = numeroA * numeroB;
                System.out.println("El resultado de "+numeroA+" * "+numeroB+
                        " es: "+multiplicacion);            
            break;
            case 4: division = numeroA/numeroB;
                System.out.println("El resultado de "+numeroA+" / "+numeroB+" es: "+division);            
            break;     
            case 5:         
  
                   System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
                   salir = leer.next();
                    
                    if(salir.equals("N")){
                       System.out.println("MENU\n" + "1. Sumar\n" +
                            "2. Restar\n"+"3. Multiplicar\n" +
                            "4. Dividir\n"+"5. Salir");
                            fin = false;
                            opcion =  leer.nextInt(); 
                    }  else{
                        fin = true; 
                    }           
            break;
                
            default: System.out.println("Opción inválida");
            break;
        }//fin switch
//    System.out.println("MENU\n" + "1. Sumar\n" + "2. Restar\n"+"3. Multiplicar\n" + "4. Dividir\n"+"5. Salir");    
//    opcion =  leer.nextInt(); 
   
    }//finwhile         
    
  }

}








































