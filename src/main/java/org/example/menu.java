package org.example;

import javax.swing.*;

public class menu {
    public static void main(String[] args) {
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Salir"};

        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        // Manejar la selección del usuario con un switch
        switch (seleccion) {
            case 0:
                // Opción 1
                JOptionPane.showMessageDialog(null, "Has seleccionado Opción 1");
                break;
            case 1:
                // Opción 2
                JOptionPane.showMessageDialog(null, "Has seleccionado Opción 2");
                break;
            case 2:
                // Opción 3
                JOptionPane.showMessageDialog(null, "Has seleccionado Opción 3");
                break;
            case 3:
                // Salir
                JOptionPane.showMessageDialog(null, "Saliendo...");
                System.exit(0); // Cierra la aplicación
                break;
            default:
                // Manejo de caso por defecto
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }
}
