package com.company;


import java.util.Scanner;

/**
 * @author Agora
 */
public class ParteA {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int comprendidos = 0;
        int anyo1;
        int anyo2;
        do {
            anyo1 = indexData(scanner, "Introduce el primer año: ");
            anyo2 = indexData(scanner, "Introduce el segundo año: ");
        } while (anyo1 > anyo2);
        final int anyo = anyo1;

        comprendidos = anyoBisiesto(anyo2, anyo);

        anyosComprendidos(comprendidos, anyo1, anyo2);
    }

    private static int indexData(final Scanner scanner, final String message) {
        int dato;
        System.out.println(message);
        dato = scanner.nextInt();
        return dato;
    }

    private static void anyosComprendidos(final int comprendidos, final int anyo1, final int anyo2) {
        if (comprendidos > 0) {
            System.out.println("El numero de años bisiesto entre los años -> " + anyo1 + " y -> " + anyo2 + "es -->" + comprendidos);
        } else {
            System.out.println("No hemos encontrado numero bisiestos en el rango solicitado.");
        }
    }

    public static int anyoBisiesto(final int anyo2, final int anyo) {
        int comprendidos = 0;
        while (anyo <= anyo2) {
            if (anyo % 4 == 0 && anyo % 100 != 0||anyo % 100 == 0 && anyo % 400 == 0) {
                System.out.println("El año -> " + anyo + " es bisiesto");
                comprendidos++;
            }

        }
        return comprendidos;
    }
}

