package egg.guia.cinco.bucles;
import java.util.Scanner;
/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

public class Ejercicio_16 {
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
        String cadena, X, O;
        int correcta = 0, incorrecta = 0;
        do {
            do {
                cadena = leer.next();
                cadena = cadena.toUpperCase();
                if ((cadena.length() < 5) || (cadena.length() > 5)) {
                    System.out.println("esta mal escrito");
                }
            } while ((cadena.length() < 5) || (cadena.length() > 5));
            X = cadena.substring(0, 1);
            O = cadena.substring(4, 5);
            if (("X".equals(X)) && ("O".equals(O))) {
                correcta += 1;//cont = cont + 1 ( sirve para todas las operaciones matematicas)
            } else {
                incorrecta += 1;
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("correcto "+correcta+" incorrecto "+incorrecta);
    }
}

    
    

