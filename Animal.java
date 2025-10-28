package com.mycompany.sistema.modelo;

import com.mycompany.sistema.excepciones.ValidacionException;

public abstract class Animal {
    private static int contadorAnimales = 0;
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        contadorAnimales++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ValidacionException {
        if (edad < 0) {
            throw new ValidacionException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws ValidacionException {
        if (peso <= 0) {
            throw new ValidacionException("El peso debe ser mayor que 0.");
        }
        this.peso = peso;
    }

    protected String generarIDInterno() {
        return "ANM-" + (1000 + contadorAnimales);
    }

    public static int getContadorAnimales() {
        return contadorAnimales;
    }

    public abstract void emitirSonido();

    public void mostrarInformacion() {
        System.out.println("ID interno: " + generarIDInterno());
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
    }
}
