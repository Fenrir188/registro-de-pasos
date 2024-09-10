package org.example;

import java.util.Scanner;

public class promedioPasos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_DIAS = 5;

        int[] pasos = new int[NUM_DIAS];

        int sumaPasos = 0;

        int i = 0;

        System.out.println("Ingrese la cantidad de pasos dados durante los últimos " + NUM_DIAS + " días:");
        while (i < NUM_DIAS) {
            System.out.print("Día " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                pasos[i] = scanner.nextInt();
                sumaPasos += pasos[i];
                i++;
            } else {
                System.out.println("Entrada inválida. Por favor,.");
                scanner.next();
            }
        }

        scanner.close();

        double promedioPasos = (double) sumaPasos / NUM_DIAS;

        System.out.println("Cantidad de pasos dados durante los últimos " + NUM_DIAS + " días:");
        for (int j = 0; j < NUM_DIAS; j++) {
            System.out.println("Día " + (j + 1) + ": " + pasos[j] + " pasos");
        }

        System.out.printf("El promedio de pasos dados durante los últimos %d días es: %.2f%n", NUM_DIAS, promedioPasos);
    }


}
