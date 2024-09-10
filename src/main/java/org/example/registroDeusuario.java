package org.example;

import java.util.Scanner;

public class registroDeusuario {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String nombre;
            String correo;
            String contrasena;

            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();

            System.out.print("Ingrese su correo electrónico: ");
            correo = scanner.nextLine();

            System.out.print("Ingrese su contraseña: ");
            contrasena = scanner.nextLine();

            scanner.close();

            System.out.println("\nDatos del Usuario:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Correo electrónico: " + correo);
            System.out.println("Contraseña: " + contrasena);
        }
}
