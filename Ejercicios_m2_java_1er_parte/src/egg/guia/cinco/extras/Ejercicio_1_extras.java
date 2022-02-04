package egg.guia.cinco.extras;
import java.util.Scanner;
/**Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.*/
public class Ejercicio_1_extras {

    public static void main(String[] args) {
    int minutos, horas,dias, minutosFin, horasFin;
    Scanner leer  = new Scanner(System.in);
    System.out.println("Ingrese minutos");
    minutos = leer.nextInt();
            
    minutosFin = minutos%60;
    horas = minutos/60;
    horasFin = minutos%24;
    dias = horas/24;   
    
    if(minutos < 60){
        System.out.println("0 dias,0 horas, "+minutos+" minutos.");
    }else{
        if(horas < 24){
        System.out.println("0 dias,"+horas+" horas, "+minutosFin+" minutos.");            
        }else{
        System.out.println(dias+" dias,"+horasFin+" horas, "+minutosFin+" minutos.");            
        }
    }
              
    }//fin main
    
}
