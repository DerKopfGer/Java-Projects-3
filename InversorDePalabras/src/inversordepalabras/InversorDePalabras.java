/*
 * Creado por Demian Baqué
 * Version 1.0
 * Creado el día 04/10/2020
 */
package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();

        
        longitudPalabra = palabra.length(); //Aquí cuento los caracteres

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }

        System.out.print("Palabra invertida: " + palabraInvertida);
        System.out.println("");
    }

}
