package com.mycompany.inout;

import java.util.Scanner; //! Importación del Scanner para leer datos por consola

public class InOut { // Nombre de tu clase

    public static void main(String[] args) { // Espacio para la funcionalidad del codigo

        int Edad;
        String Nombre, Apellido;
        double Estatura;

        // ? Creamos un objeto de la clase Scanner
        // ? LLamado "Teclado" con el que leeremos los datos
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        Nombre = Teclado.next();// * Usamos el nombre del objeto "Teclado"
        // * Seguido del metodo ".next" que permite recibir infotrmación por la consola

        System.out.println("Ingresa tu apellido:");
        Apellido = Teclado.next();

        System.out.println("Ingresa tu edad:");
        Edad = Teclado.nextInt(); // ? nextInt() Indica que recibira dato entero

        System.out.println("Ingresa tu estatura:");
        Estatura = Teclado.nextDouble(); // ! Al igual netDouble() Indica que recibira un dato double

        System.out.println("Hello World!");
        System.out.println("Datos Personales:");
        System.out.println("Nombre: " + Nombre + " " + Apellido);
        System.out.println("Edad: " + Edad);
        System.out.println("Estatiura: " + Estatura);

    }
}
