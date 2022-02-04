package egg.guia.cinco.extras;

import java.util.Scanner;

/*Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/
public class ejercicio_6_extras {

    public static void main(String[] args) {
        
        int cantGral = 0, cantBajos = 0;
        float estatura=0;
        double promedioBajo, promedioGral;
        double bajos=0, general=0;
        String ingresar ="S";

        promedioBajo=0;
        promedioGral=0;
        
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese estatura en metros");
            estatura = leer.nextFloat();

            if (estatura < 1.60) {
                cantBajos++;
                bajos += estatura;
            }
                cantGral++;
                general += estatura;
                
            System.out.println("Desea ingresar otro? S/N");
            ingresar = leer.next();

        } while (ingresar.equals("s"));
        
        if(cantBajos>0){
            promedioBajo =(double) bajos/cantBajos;
        }else{
            System.out.println("No hubo bajos"); 
            promedioBajo = 0;
        }
    
        promedioGral =(double) general/cantGral;
                
        System.out.println("Promedio bajos: "+promedioBajo+", general: "+promedioGral);
    }//fin main

}//finalgorit
