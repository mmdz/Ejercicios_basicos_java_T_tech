package egg.guia.cinco.extras;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios: o Los socios tipo ‘A’ abonan una
 * cuota mayor, pero tienen un 50% de descuento en todos los tipos de
 * tratamientos. o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
 * de descuento para los mismos tratamientos que los socios del tipo A. o Los
 * socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos. Solicite una letra (carácter) que representa la clase de un
 * socio, y luego un valor real que represente el costo del tratamiento (previo
 * al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
public class Ejercicio_5_extras {

    public static void main(String[] args) {
        String tipoSocio;
        Double descuento, costo, importe;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio A,B o C: ");
        tipoSocio = leer.nextLine();

        switch (tipoSocio.toUpperCase()) {
            case "A":
                System.out.println("Ingrese costo del tratamiento: ");
                costo = leer.nextDouble();
                importe = costo * 0.5;
                System.out.println("El importe es: $" + importe + ",con descuento 50%");
                break;
            case "B":
                System.out.println("Ingrese costo del tratamiento: ");
                costo = leer.nextDouble();
                importe = costo - (costo * 0.35);
                System.out.println("El importe es: $" + importe + ",con descuento 35%");
                break;
            case "C":
                System.out.println("Ingrese costo del tratamiento: ");
                costo = leer.nextDouble();
                System.out.println("El importe es: $" + costo + ",sin descuentos");
                break;
            default:
                System.out.println("Tipo de socio no válido");
                break;
        }
    }

}
