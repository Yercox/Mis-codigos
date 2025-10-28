package com.mycompany.sistema.main;

import com.mycompany.sistema.modelo.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---- SISTEMA DE REGISTRO DE ANIMALES ----");

        try {
            System.out.println(">> REGISTRO DE PERRO:");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            sc.nextLine();

            System.out.print("Color del pelaje: ");
            String pelaje = sc.nextLine();

            Perro perro = new Perro(nombre, edad, peso, pelaje);

            System.out.println("\n>> REGISTRO DE PÁJARO:");
            System.out.print("Nombre: ");
            String np = sc.nextLine();
            System.out.print("Edad: ");
            int ep = sc.nextInt();
            System.out.print("Peso: ");
            double pp = sc.nextDouble();
            System.out.print("Tamaño de alas (cm): ");
            double alas = sc.nextDouble();

            Pajaro pajaro = new Pajaro(np, ep, pp, alas);

            System.out.println("\n---- ANIMALES REGISTRADOS ----");
            perro.mostrarInformacion();
            pajaro.mostrarInformacion();

            System.out.println("\nTotal de animales registrados: " + Animal.getContadorAnimales());

        } 
       
        catch (InputMismatchException ime) {
            System.out.println("Error: Debe ingresar un valor numérico válido.");
        } catch (IllegalArgumentException iae) {
            System.out.println("Error de entrada: " + iae.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("\nPrograma finalizado correctamente.");
        }
    }
}
