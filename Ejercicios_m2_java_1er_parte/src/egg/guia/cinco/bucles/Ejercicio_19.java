package egg.guia.cinco.bucles;

import java.util.Scanner;

/* Crea una aplicación que a través de una función nos convierta una cantidad de
        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
        libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
        converir que será una cadena, este no devolverá ningún valor y mostrará un
        mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
 */
public class Ejercicio_19 {

    public static void main(String[] args) {

// Primero voy a poner la abreviatura para llamar a mi “código”
// Luego escribo el código a utilizar.
       
            
            Scanner leer = new Scanner(System.in);
            double euro;
            String moneda;

            System.out.println("Diga la cantidad de euros que va a convertir: ");
            euro = leer.nextDouble();

            do {
                System.out.println("Escriba a que moneda quiere cambiar, si es dolares, yenes o libras: ");
                moneda = leer.next(); //leer moneda como caracteres
                moneda = moneda.toUpperCase();
                
                if ((!"DOLARES".equals(moneda) || !"YENES".equals(moneda) || !"LIBRAS".equals(moneda))) {
                    System.out.println("Correcto");
                    break;
                } else {
                    System.out.println("Incorrecto");
                }
                
            } while (!"DOLARES".equals(moneda) || !"YENES".equals(moneda) || !"LIBRAS".equals(moneda));

            intercambio(euro, moneda); //llamo a la funcion intercambio
            
        }//fin Main
               
///////////funciones////////////////        
        public static void intercambio(double euro, String moneda){ //funcion intercambio
        
        double dolar,yenes,libras;
        
        if (null != moneda) switch (moneda) {
            case "DOLARES":
                    dolar = euro * 0.86;
                    System.out.println(euro + " euros pasado a dolares es igual a: " + dolar);
                    break;
                case "YENES":
                    yenes = euro * 1.28611 / 1;
                    System.out.println(euro + " euros pasado a yenes es igual a: " + yenes);
                    break;
                case "LIBRAS":
                    libras = euro * 129.852 / 1;
                    System.out.println(euro + " euros pasado a libras es igual a: " + libras);
                    break;
            }
        }//fin funcion intercambio

    
}//fin programa


